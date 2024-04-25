package com.sheryians.major.dto;

import lombok.Data;

@Data
public class ProductDTO {
    private long id;
    private String name;
    private int categoryId;
    private double price;
    // private double weight;
    private String description;
    private String imageName;

    public static class ProductBuilder {
        private long id;
        private String name;
        private int categoryId;
        private double price;
        // private double weight;
        private String description;
        private String imageName;

        public ProductBuilder() {}

        public ProductBuilder setId(long id) {
            this.id = id;
            return this;
        }

        public ProductBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder setCategoryId(int categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public ProductBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        // public ProductBuilder setWeight(double weight) {
        //     this.weight = weight;
        //     return this;
        // }

        public ProductBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }

        public ProductDTO build() {
            ProductDTO productDTO = new ProductDTO();
            productDTO.setId(this.id);
            productDTO.setName(this.name);
            productDTO.setCategoryId(this.categoryId);
            productDTO.setPrice(this.price);
            // productDTO.setWeight(this.weight);
            productDTO.setDescription(this.description);
            productDTO.setImageName(this.imageName);
            return productDTO;
        }
    }
}
