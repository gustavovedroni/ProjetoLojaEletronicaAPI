package com.estagio.persisti.repositories;

import com.estagio.persisti.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}