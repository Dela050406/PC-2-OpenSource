package com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.valueobjects;

import java.util.UUID;

public record WarehouseId(UUID value) {
    public WarehouseId {
        if (value == null) {
            throw new IllegalArgumentException("value cannot be null");
        }
    }
}
