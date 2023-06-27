package com.prac.relationship.data.repository.support;

import com.prac.relationship.data.entity.Product;
import com.prac.relationship.data.entity.QProduct;
import java.util.List;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Component;

// 예제 8.37
@Component
public class ProductRepositoryCustomImpl extends QuerydslRepositorySupport implements
        com.prac.relationship.data.repository.support.ProductRepositoryCustom {

    public ProductRepositoryCustomImpl() {
        super(Product.class);
    }

    @Override
    public List<Product> findByName(String name) {
        QProduct product = QProduct.product;

        List<Product> productList = from(product)
            .where(product.name.eq(name))
            .select(product)
            .fetch();

        return productList;
    }
}

// Reference (https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/support/QuerydslRepositorySupport.html)