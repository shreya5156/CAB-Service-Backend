package com.CabBooking.Cab.service;

import com.CabBooking.Cab.representation.request.UserRegisterRequest;

public interface IUserService {
    String registerUser( UserRegisterRequest userRegisterRequest);

}
