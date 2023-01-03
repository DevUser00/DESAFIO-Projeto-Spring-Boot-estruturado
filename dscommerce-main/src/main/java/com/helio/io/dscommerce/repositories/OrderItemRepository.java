package com.helio.io.dscommerce.repositories;

import com.helio.io.dscommerce.entities.OrderItem;
import com.helio.io.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository <OrderItem, OrderItemPK> {

}
