package com.CabBooking.Cab.representation.request;

import com.CabBooking.Cab.representation.dto.Coordinates;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FindRideRequest {
    private String name;
    private Coordinates coordinates;
}
