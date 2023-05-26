package com.estagio.persisti.entities.repositories;

import com.estagio.persisti.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
    boolean existsByName(String name);
}
