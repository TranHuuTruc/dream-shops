package com.tht.dream_shops.repository;

import com.tht.dream_shops.module.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem,Integer> {
    void deleteByCartId(Long id);
}
