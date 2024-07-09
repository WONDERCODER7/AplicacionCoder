package com.Commerce.commerce.Repository;

import com.Commerce.commerce.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {
}
