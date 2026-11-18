package com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.infrastructure.converters;

import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.valueobjects.DeliveryCode;
import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.valueobjects.WarehouseId;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.UUID;

@Converter(autoApply = false)

public class WarehouseIdPersistenceConverter implements AttributeConverter<WarehouseId, UUID> {

    @Override
    public UUID convertToDatabaseColumn(WarehouseId attribute) {
        return attribute==null ? null : attribute.value();
    }

    @Override
    public WarehouseId convertToEntityAttribute(UUID dbData) {
        return dbData==null ? null : new WarehouseId(dbData);
    }
}
