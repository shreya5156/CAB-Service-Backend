package com.CabBooking.Cab.service;

import com.CabBooking.Cab.representation.dto.DriverAvailabilityDetailsDTO;
import com.CabBooking.Cab.representation.request.FindRideRequest;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IFindRideService {
     List<DriverAvailabilityDetailsDTO> findRide( FindRideRequest findRideRequest);
}
