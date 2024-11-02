package com.project.ecommerce.repository;

import com.project.ecommerce.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    @Query("SELECT c "
            + "FROM Cart c "
            + "WHERE c.products.id = :productId")
    Cart findProductById(Long productId);

    Cart findCartById(Long id);

}
