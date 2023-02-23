package com.uniyaz.eticaret.controller;

import com.uniyaz.eticaret.entity.Product;
import com.uniyaz.eticaret.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/product")
public class ProductController {
    @Autowired
    ProductService productService;


    @GetMapping(path = "/getAll")
    public ResponseEntity getAllProduct(){
        List<Product> allProducts = productService.findAllProduct();
        ResponseEntity responseEntity = new ResponseEntity(allProducts,HttpStatus.ACCEPTED);
        return  responseEntity;
    }

    @PostMapping(path = "/save")
    public ResponseEntity  saveProduct(@RequestBody Product product){

        Product savedProduct = productService.save(product);
        if (savedProduct.getProductId()!=null) {
            ResponseEntity responseEntity = new ResponseEntity(savedProduct, HttpStatus.OK);
            return responseEntity;
        } else {
            ResponseEntity responseEntity = new ResponseEntity(HttpStatus.NO_CONTENT);
            return responseEntity;
        }
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }

}
