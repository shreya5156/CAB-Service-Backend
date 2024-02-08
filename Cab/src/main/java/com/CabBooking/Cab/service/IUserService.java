package com.CabBooking.Cab.service;

import com.CabBooking.Cab.representation.request.DriverRegisterRequest;
import com.CabBooking.Cab.representation.request.UserRegisterRequest;
import org.springframework.web.bind.annotation.RequestBody;

public interface IUserService {
    String registerUser( UserRegisterRequest userRegisterRequest);

}
