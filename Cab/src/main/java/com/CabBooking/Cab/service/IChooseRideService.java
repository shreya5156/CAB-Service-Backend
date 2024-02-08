package com.CabBooking.Cab.service;

import com.CabBooking.Cab.representation.request.ChooseRideRequest;
import org.springframework.web.bind.annotation.RequestBody;

public interface IChooseRideService {
    String chooseRide( ChooseRideRequest chooseRideRequest);
}
