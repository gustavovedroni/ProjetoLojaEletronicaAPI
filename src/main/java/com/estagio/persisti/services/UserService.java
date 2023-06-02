package com.estagio.persisti.services;

import com.estagio.persisti.entities.User;
import com.estagio.persisti.entities.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);
    }

    public User createUser(User user) {
        return repository.save(user);
    }

    public User loginUser(String email, String password) {
        User user = this.repository.findByEmailAndPassword(email, password);
        if (user == null) {
            throw new IllegalArgumentException("Credenciais de login inválidas.");
        }
        return user;
    }


    public User updateUser(Long id, User user) {
        User existingUser = repository.findById(id).orElse(null);
        if (existingUser != null) {
            existingUser.setName(user.getName());
            existingUser.setEmail(user.getEmail());
            // Atualize outros campos conforme necessário
            return repository.save(existingUser);
        }
        return null;
    }

    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
}
