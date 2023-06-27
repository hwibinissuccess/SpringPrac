package com.prac.relationship.data.repository;

import com.prac.relationship.data.entity.Product;
import com.prac.relationship.data.entity.Provider;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class ProviderRepositoryTest {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProviderRepository providerRepository;

    @Test
    void relationshipTest(){

        Provider provider = new Provider();
        provider.setName("휘빈물산");

        providerRepository.save(provider);

        Product product1 = new Product();
        product1.setName("computer");
        product1.setPrice(3000);
        product1.setStock(300);
        product1.setProvider(provider);

        Product product2 = new Product();
        product1.setName("keyboard");
        product1.setPrice(6000);
        product1.setStock(600);
        product1.setProvider(provider);

        Product product3 = new Product();
        product1.setName("mouse");
        product1.setPrice(9000);
        product1.setStock(900);
        product1.setProvider(provider);


        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);

        List<Product> products = providerRepository.findById(provider.getId()).get()
                .getProductList();

        for(Product product : products){
            System.out.println(product);
        }

    }

}
