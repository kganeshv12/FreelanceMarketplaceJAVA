package com.sheryians.major.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sheryians.major.model.Product;
// import com.sheryians.major.prototype.ProductPrototype;
import com.sheryians.major.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    // @Autowired
    // ProductPrototype productPrototype;

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public void removeProductsById(long id) {
        productRepository.deleteById(id);
    }

    public Optional<Product> getProductById(long id) {
        return productRepository.findById(id);
    }

    public List<Product> getAllProductsByCategoryID(int id) {
        return productRepository.findAllByCategory_Id(id);
    }

    // Prototype pattern method to clone a product
    // public Product cloneProduct(long id) {
    //     Optional<Product> productOptional = productRepository.findById(id);
    //     if (productOptional.isPresent()) {
    //         Product existingProduct = productOptional.get();
    //         return productPrototype.cloneProduct(existingProduct);
    //     }
    //     return null; // or throw exception if necessary
    // }
}
