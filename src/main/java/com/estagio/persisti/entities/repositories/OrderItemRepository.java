package com.estagio.persisti.entities.repositories;


import com.estagio.persisti.entities.OrderItem;
import com.estagio.persisti.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
