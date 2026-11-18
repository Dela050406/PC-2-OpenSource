package com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.infrastructure.converters;

import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.valueobjects.DeliveryCode;
import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.valueobjects.PackageLoad;
import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.valueobjects.WarehouseId;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.UUID;

@Converter(autoApply = false)

public class PackageLoadPersistenceConverter implements AttributeConverter<PackageLoad, Integer> {

    @Override
    public Integer convertToDatabaseColumn(PackageLoad attribute) {
        return attribute==null ? null : attribute.quantity();
    }

    @Override
    public PackageLoad convertToEntityAttribute(Integer dbData) {
        return dbData==null ? null : new PackageLoad(dbData);
    }




}
