package com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.valueobjects;

import java.time.LocalDate;

public record DeliveryWindow(LocalDate startDate, LocalDate endDate) {


    public DeliveryWindow {
        if (startDate == null){
            throw new IllegalArgumentException ("StartDate cannot be null");
        }
        if (endDate == null){
            throw new IllegalArgumentException ("EndDate cannot be null");
        }
        if (!endDate.isAfter(startDate)){
            throw new IllegalArgumentException ("EndDate must be after StartDate");
        }

    }
}
