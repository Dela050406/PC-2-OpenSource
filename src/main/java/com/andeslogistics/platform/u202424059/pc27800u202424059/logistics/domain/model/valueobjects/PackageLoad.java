package com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.valueobjects;

public record PackageLoad(Integer quantity, String unit) {


    public PackageLoad {

        if (quantity == null) {
            throw new IllegalArgumentException("quantity cannot be null");
        }

        if (unit == null) {
            throw new IllegalArgumentException("value cannot be null");
        }

    }
}
