package com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.infrastructure.mappers;


import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.aggregates.DeliveryOrder;
import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.valueobjects.DeliveryCode;
import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.valueobjects.DeliveryStatus;
import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.valueobjects.PackageLoad;
import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.valueobjects.WarehouseId;
import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.infrastructure.entities.DeliveryOrderPersistenceEntity;

public class DeliveryOrderPersistenceMapper {
    public static DeliveryOrder toDomain(DeliveryOrderPersistenceEntity entity) {
        return new DeliveryOrder(
                entity.getId(),
                entity.getCode(),
                entity.getEndDate(),
                entity.getValue(),
                entity.getStartDate(),
                entity.getQuantity(),
                entity.getCreatedAt(),
                entity.getUpdatedAt(),
        );
    }

    public static DeliveryOrderPersistenceEntity toEntity(DeliveryOrder entity) {
        return DeliveryOrderPersistenceEntity.builder()
                .value(entity.getId())
                .build();
    }

}
