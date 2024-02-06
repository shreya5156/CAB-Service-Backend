package com.CabBooking.Cab.controller;

import com.CabBooking.Cab.representation.request.DriverRegisterRequest;
import com.CabBooking.Cab.representation.request.UserRegisterRequest;
import com.CabBooking.Cab.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private IUserService userService;
    @Autowired
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user/register")
    public String registerUser(@RequestBody UserRegisterRequest userRegisterRequest) {
       return userService.registerUser(userRegisterRequest);
    }
}
