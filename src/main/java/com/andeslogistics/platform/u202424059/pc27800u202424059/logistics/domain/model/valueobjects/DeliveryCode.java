package com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.valueobjects;

public record DeliveryCode(String code) {
    public DeliveryCode {

        if (code == null || code.isBlank()) {
            throw new IllegalArgumentException("Code cannot be null");
        }

    }
}
