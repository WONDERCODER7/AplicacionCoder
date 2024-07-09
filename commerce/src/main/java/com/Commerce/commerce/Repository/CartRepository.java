package com.Commerce.commerce.Repository;

import com.Commerce.commerce.Entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository <Cart, Long> {
}
