package exirium.pe.SpringCloud.repositories;

import exirium.pe.SpringCloud.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {


}
