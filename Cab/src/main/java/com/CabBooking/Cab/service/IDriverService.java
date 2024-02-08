package com.CabBooking.Cab.service;

import com.CabBooking.Cab.representation.request.DriverRegisterRequest;
import org.springframework.web.bind.annotation.RequestBody;

public interface IDriverService {
    String registerDriver( DriverRegisterRequest driverRegisterRequest );
}
