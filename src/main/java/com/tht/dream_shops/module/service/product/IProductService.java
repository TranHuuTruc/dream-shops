package com.tht.dream_shops.module.service.product;

import com.tht.dream_shops.module.Category;
import com.tht.dream_shops.module.Product;

import java.util.List;

public interface IProductService {
    Product addProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(Long id);

    void updateProduct(Product product, Long productId);

    void deleteProducById(Long id);

    List<Product> getAllProductsByCategory(String category);

    List<Product> getAllProductsByBrand(String brand);

    List<Product> getAllProductsByCategoryAndBrand(String category, String brand);

    List<Product> getProductsByName(String name);

    List<Product> getProductsByBrandAndName(String brand, String name);

    Long countAllProductsByBrandAndName(String brand, String name);


}
