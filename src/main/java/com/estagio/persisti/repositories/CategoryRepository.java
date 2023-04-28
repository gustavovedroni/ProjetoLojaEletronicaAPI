package com.estagio.persisti.repositories;

import com.estagio.persisti.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
