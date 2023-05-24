package com.estagio.persisti.entities.repositories;

import com.estagio.persisti.entities.Order;
import com.estagio.persisti.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
