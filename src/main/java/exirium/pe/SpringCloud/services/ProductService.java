package exirium.pe.SpringCloud.services;

import exirium.pe.SpringCloud.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAll();

    Optional<Product> findById(Long id);
}
