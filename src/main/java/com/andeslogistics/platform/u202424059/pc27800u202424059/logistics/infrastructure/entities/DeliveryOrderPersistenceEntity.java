package com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.infrastructure.entities;

import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.valueobjects.DeliveryCode;
import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.valueobjects.DeliveryWindow;
import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.valueobjects.PackageLoad;
import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.infrastructure.converters.DeliveryCodePersistenceConverter;
import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.infrastructure.converters.DeliveryWindowPersistenceConverter;
import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.infrastructure.converters.PackageLoadPersistenceConverter;
import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.infrastructure.converters.WarehouseIdPersistenceConverter;
import com.andeslogistics.platform.u202424059.pc27800u202424059.shared.infrastructure.persistence.jpa.AuditableAbstractPersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeliveryOrderPersistenceEntity extends AuditableAbstractPersistenceEntity {

    @Convert(converter = DeliveryCodePersistenceConverter.class)
    @Column(name = "code", nullable = false, updatable = false)
    private DeliveryCode code;
    @Convert(converter = DeliveryWindowPersistenceConverter.class)
    @Column(name = "endDate", nullable = false, updatable = false)
    private DeliveryWindow endDate;
    @Convert(converter = DeliveryWindowPersistenceConverter.class)
    @Column(name = "startDate", nullable = false, updatable = false)
    private DeliveryWindow startDate;
    @Convert(converter = PackageLoadPersistenceConverter.class)
    @Column(name = "quantity", nullable = false, updatable = false)
    private PackageLoad quantity;
    @Convert(converter = PackageLoadPersistenceConverter.class)
    @Column(name = "unit", nullable = false, updatable = false)
    private PackageLoad unit;
    @Convert(converter = WarehouseIdPersistenceConverter.class)
    @Column(name = "value", nullable = false, updatable = false)
    private PackageLoad value;

}