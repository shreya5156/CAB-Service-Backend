package com.CabBooking.Cab.service;

import com.CabBooking.Cab.representation.request.DriverRegisterRequest;

public interface IDriverService {
    String registerDriver( DriverRegisterRequest driverRegisterRequest );
}
