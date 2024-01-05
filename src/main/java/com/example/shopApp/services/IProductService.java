package com.example.shopApp.services;

import com.example.shopApp.DTO.ProductDTO;
import com.example.shopApp.DTO.ProductImageDTO;
import com.example.shopApp.model.Product;
import com.example.shopApp.model.ProductImage;
import com.example.shopApp.responses.ProductResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface IProductService {
    Product createProduct(ProductDTO productDTO) throws Exception;
    Product getProductById(long id) throws Exception;
    Page<ProductResponse> getAllProducts(PageRequest pageRequest);
    Product updateProduct(long id, ProductDTO productDTO) throws Exception;
    void deleteProduct(long id);
    boolean existsByName(String name);
    ProductImage createProductImage(
            Long productId,
            ProductImageDTO productImageDTO) throws Exception;
}
