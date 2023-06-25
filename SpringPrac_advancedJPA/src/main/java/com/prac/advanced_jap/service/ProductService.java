package com.prac.advanced_jap.service;

import com.prac.advanced_jap.data.dto.ProductDto;
import com.prac.advanced_jap.data.dto.ProductResponseDto;

public interface ProductService {

    ProductResponseDto getProduct(Long number);

    ProductResponseDto saveProduct(ProductDto productDto);

    ProductResponseDto changeProductName(Long number, String name) throws Exception;

    void deleteProduct(Long number) throws Exception;
}
