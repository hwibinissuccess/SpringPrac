package com.prac.relationship.data.repository;

import com.prac.relationship.data.entity.Product;
import com.prac.relationship.data.entity.ProductDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductDetailRepositoryTest {

    @Autowired
    ProductDetailRepository productDetailRepository;

    @Autowired
    com.prac.relationship.data.repository.support.ProductRepository productRepository;

    @Test
    public void saveAndReadTest1(){

        Product product = new Product();
        product.setName("Spring JPA");
        product.setPrice(3000);
        product.setStock(300);

        productRepository.save(product);

        ProductDetail productDetail = new ProductDetail();

        productDetail.setProduct(product);
        productDetail.setDescription("Prac Spring");

        productDetailRepository.save(productDetail);

        System.out.println("savedProduct : " + productDetailRepository.findById(
                productDetail.getId()).get().getProduct());

        System.out.println("savedProductDetail : " + productDetailRepository.findById(
                productDetail.getId()).get());

    }

}
