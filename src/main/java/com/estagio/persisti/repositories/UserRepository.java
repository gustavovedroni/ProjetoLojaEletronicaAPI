package com.estagio.persisti.repositories;

import com.estagio.persisti.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
