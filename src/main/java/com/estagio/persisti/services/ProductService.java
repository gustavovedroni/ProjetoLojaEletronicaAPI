package com.estagio.persisti.services;

import com.estagio.persisti.entities.Product;
import com.estagio.persisti.entities.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;
    public Product create(Product product) {
        // Verificar se o produto já existe no banco de dados
        if (repository.existsByName(product.getName())) {
            throw new RuntimeException("Produto já cadastrado");
        }

        return repository.save(product);
    }


    public Product update(Long id, Product product) {
        Product existingProduct = findById(id);
        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
