package com.CabBooking.Cab.service.impl;
import com.CabBooking.Cab.representation.request.UserRegisterRequest;
import com.CabBooking.Cab.service.IUserService;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {
    static Map<String,UserRegisterRequest> userMap = new HashMap<>();
    @Override
    public String registerUser(UserRegisterRequest userRegisterRequest) {
        try{
            userMap.put(userRegisterRequest.getName(),userRegisterRequest);
        } catch (Exception e) {
            e.printStackTrace();
            throw  new RuntimeException("Error while processing your request");
        }
        return "Your registration is successful";
    }
}
