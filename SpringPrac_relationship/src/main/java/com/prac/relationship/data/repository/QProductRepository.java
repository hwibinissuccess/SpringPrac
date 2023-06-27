package com.prac.relationship.data.repository;

import com.prac.relationship.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

// 예제 8.31
public interface QProductRepository extends JpaRepository<Product, Long>,
    QuerydslPredicateExecutor<Product> {

}

// Reference (https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/querydsl/QuerydslPredicateExecutor.html)
