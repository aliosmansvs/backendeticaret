package com.uniyaz.eticaret.controller;

import com.uniyaz.eticaret.entity.Basket;
import com.uniyaz.eticaret.entity.Product;
import com.uniyaz.eticaret.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/basket")
public class BasketController {

    @Autowired
    BasketService basketService;

    @GetMapping(path = "/findAllById")
    public ResponseEntity getAllProduct(){
        List<Basket> allProductBasket = basketService.findAllProductBasket();
        ResponseEntity responseEntity = new ResponseEntity(allProductBasket,HttpStatus.ACCEPTED);
        return  responseEntity;
    }

    @GetMapping(path = "/getAll")
    public ResponseEntity getAllBasket(){
        List<Basket> allBaskets = basketService.findAllBasket();
        ResponseEntity responseEntity = new ResponseEntity(allBaskets,HttpStatus.ACCEPTED);
        return  responseEntity;
    }

    @PostMapping(path = "/save")
    public ResponseEntity saveBasket(@RequestBody Product product){

        Basket savedBasket = basketService.save(product);
        if (savedBasket.getId()!=null) {
            ResponseEntity responseEntity = new ResponseEntity(savedBasket, HttpStatus.OK);
            return responseEntity;
        } else {
            ResponseEntity responseEntity = new ResponseEntity(HttpStatus.NO_CONTENT);
            return responseEntity;
        }
    }
    @DeleteMapping(path = "/delete/{id}")
    public void deleteBasket(@PathVariable Long id){
        basketService.deleteBasket(id);
    }

}
