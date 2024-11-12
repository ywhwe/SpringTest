package com.spring.service.controller;

import com.spring.service.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    //TODO: Must need to success output; this can only data input for now
    //private final MongoService mongService;

    /*@GetMapping("/readData")
    public List<User> findAll() {
        return this.mongoService.getList();
    }*/
}
