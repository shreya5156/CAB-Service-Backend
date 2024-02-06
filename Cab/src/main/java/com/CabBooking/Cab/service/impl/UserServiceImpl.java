package com.CabBooking.Cab.service.impl;

import com.CabBooking.Cab.representation.request.DriverRegisterRequest;
import com.CabBooking.Cab.representation.request.UserRegisterRequest;
import com.CabBooking.Cab.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    List<UserRegisterRequest> userList = new ArrayList<>();
    @Override
    public String registerUser(UserRegisterRequest userRegisterRequest) {
        try{
            userList.add(userRegisterRequest);
        } catch (Exception e) {
            e.printStackTrace();
            throw  new RuntimeException("Error while processing your request");
        }
        return "Your registration is successful";
    }
}
