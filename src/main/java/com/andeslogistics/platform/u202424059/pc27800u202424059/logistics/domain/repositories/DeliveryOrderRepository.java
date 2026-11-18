package com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.repositories;

import com.andeslogistics.platform.u202424059.pc27800u202424059.logistics.domain.model.aggregates.DeliveryOrder;
import org.hibernate.internal.util.Optional;

public interface DeliveryOrderRepository {

    Optional<DeliveryOrder> findById(Long id);
    DeliveryOrder save(DeliveryOrder deliveryOrder);
    boolean existsById(Long id);
    boolean deliveryCode(String code);
    DeliveryOrder update(DeliveryOrder deliveryOrder);
    Optional<DeliveryOrder> findByDeliveryCode(String code);

}
