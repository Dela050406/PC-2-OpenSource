package com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.aggregates;

import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.valueobjects.*;

public class DeliveryOrder {

    private Long id;
    private DeliveryCode deliveryCode;
    private WarehouseId warehouseId;
    private WarehouseId deliveryWindow;
    private PackageLoad packageLoad;
    private Integer priorityLevel;
    private DeliveryStatus status;
    private String deliveryNotes;
}
