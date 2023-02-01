package ems.example.ems.controller;

import ems.example.ems.entity.StallHolder;
import ems.example.ems.entity.User;
import ems.example.ems.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    IUserService userService;

    public @GetMapping("/get")
    List<User> get(){
        return userService.get();
    }
}
