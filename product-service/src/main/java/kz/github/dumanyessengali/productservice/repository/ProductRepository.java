package kz.github.dumanyessengali.productservice.repository;

import kz.github.dumanyessengali.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
