package com.uniyaz.eticaret.controller;

import com.uniyaz.eticaret.entity.Shop;
import com.uniyaz.eticaret.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/shop")
public class ShopController {

    @Autowired
    ShopService shopService;

    @PostMapping(path = "/add")
    public ResponseEntity shopAdd(@RequestBody Shop shop) {
        shop=shopService.save(shop);
        return new ResponseEntity(shop, HttpStatus.ACCEPTED);
    }
}
