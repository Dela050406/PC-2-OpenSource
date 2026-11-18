package com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.infrastructure.converters;

import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.valueobjects.DeliveryCode;
import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.valueobjects.DeliveryWindow;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.time.LocalDate;

@Converter(autoApply = false)

public class DeliveryWindowPersistenceConverter implements AttributeConverter<DeliveryWindow, LocalDate> {

    @Override
    public LocalDate convertToDatabaseColumn(DeliveryWindow attribute) {
        return attribute==null ? null : attribute.endDate();
    }

    @Override
    public DeliveryWindow convertToEntityAttribute(LocalDate dbData) {
        return null;
    }

}

