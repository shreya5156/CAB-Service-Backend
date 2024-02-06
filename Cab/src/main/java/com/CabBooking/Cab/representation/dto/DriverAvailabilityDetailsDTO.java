package com.CabBooking.Cab.representation.dto;

import com.CabBooking.Cab.configuration.constant.user.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverAvailabilityDetailsDTO {
    private String name;
    private Gender gender;
    private Integer age;
    private String carDetails;
    private Coordinates coordinates;
    private boolean isAvailable;
}
