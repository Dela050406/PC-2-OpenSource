package com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.infrastructure.converters;

import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.valueobjects.DeliveryCode;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = false)
public class DeliveryCodePersistenceConverter implements AttributeConverter<DeliveryCode, String> {

    @Override
    public String convertToDatabaseColumn(DeliveryCode attribute) {
        return attribute==null ? null : attribute.code();
    }

    @Override
    public DeliveryCode convertToEntityAttribute(String dbData) {
        return dbData==null ? null : new DeliveryCode(dbData);
    }

}
