package com.spring.services.controller;

import com.spring.services.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.services.model.User;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("test")
public class UserController {
    User user;
    private final TestService testService = new TestService();

    @GetMapping("/get")
    public ResponseEntity<User> getUser() throws Exception {
        List<User> list = testService.getUsers();
        return ResponseEntity.ok((User) list);
    }
}
