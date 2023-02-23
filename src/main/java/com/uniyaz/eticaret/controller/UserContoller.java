package com.uniyaz.eticaret.controller;


import com.uniyaz.eticaret.entity.User;
import com.uniyaz.eticaret.service.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/user")
public class UserContoller {

    @Autowired
    UserService userService;

    @GetMapping("/login/{userName}{userPassword}")

    public ResponseEntity loginControl(@PathVariable() String userName,String userPassword){
        return null;

    }


}
