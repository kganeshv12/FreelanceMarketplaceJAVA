package com.sheryians.major.factory;

import com.sheryians.major.dto.ProductDTO;
import com.sheryians.major.model.Product;
import com.sheryians.major.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductFactory {

    // Singleton instance
    private static ProductFactory instance;

    // Private constructor to prevent instantiation
    private ProductFactory() {
    }

    // Lazy initialization of the singleton instance
    public static ProductFactory getInstance() {
        if (instance == null) {
            synchronized (ProductFactory.class) {
                if (instance == null) {
                    instance = new ProductFactory();
                }
            }
        }
        return instance;
    }

    @Autowired
    private CategoryService categoryService;

    public Product createProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setId(productDTO.getId());
        product.setName(productDTO.getName());
        product.setCategory(categoryService.getCategoryById(productDTO.getCategoryId()).orElse(null));
        product.setPrice(productDTO.getPrice());
        // product.setWeight(productDTO.getWeight());
        product.setDescription(productDTO.getDescription());
        product.setImageName(productDTO.getImageName());
        return product;
    }
    // builder pattern used
    public ProductDTO.ProductBuilder createProductBuilder() {
        return new ProductDTO.ProductBuilder();
    }
}
