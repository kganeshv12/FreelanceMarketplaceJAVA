package com.sheryians.major.prototype;

import com.sheryians.major.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductPrototype {

    public Product cloneProduct(Product product) {
        // Perform a deep or shallow copy of the product object
        // depending on your requirements
        Product clonedProduct = new Product();
        clonedProduct.setId(product.getId());
        clonedProduct.setName(product.getName());
        clonedProduct.setCategory(product.getCategory());
        // Set other attributes as needed
        return clonedProduct;
    }
}
