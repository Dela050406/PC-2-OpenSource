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

    public DeliveryOrder(String deliveryNotes,
                         DeliveryStatus status,
                         Integer priorityLevel,
                         PackageLoad packageLoad,
                         WarehouseId warehouseId,
                         WarehouseId deliveryWindow,
                         DeliveryCode deliveryCode) {
        this.deliveryNotes = deliveryNotes;
        this.status = status;
        this.priorityLevel = priorityLevel;
        this.packageLoad = packageLoad;
        this.warehouseId = warehouseId;
        this.deliveryWindow = deliveryWindow;
        this.deliveryCode = deliveryCode;
    }

    public DeliveryOrder(Long id, DeliveryCode deliveryCode,
                         WarehouseId warehouseId,
                         PackageLoad packageLoad,
                         WarehouseId deliveryWindow,
                         Integer priorityLevel,
                         DeliveryStatus status,
                         String deliveryNotes) {
        this.id = id;
        this.deliveryCode = deliveryCode;
        this.warehouseId = warehouseId;
        this.packageLoad = packageLoad;
        this.deliveryWindow = deliveryWindow;
        this.priorityLevel = priorityLevel;
        this.status = status;
        this.deliveryNotes = deliveryNotes;
    }


    public Long getId() {
        return id;
    }

    public DeliveryCode getDeliveryCode() {
        return deliveryCode;
    }

    public WarehouseId getWarehouseId() {
        return warehouseId;
    }

    public WarehouseId getDeliveryWindow() {
        return deliveryWindow;
    }

    public PackageLoad getPackageLoad() {
        return packageLoad;
    }

    public Integer getPriorityLevel() {
        return priorityLevel;
    }

    public DeliveryStatus getStatus() {
        return status;
    }

    public String getDeliveryNotes() {
        return deliveryNotes;
    }
}
