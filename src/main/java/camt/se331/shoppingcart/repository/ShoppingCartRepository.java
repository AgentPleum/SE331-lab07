package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by AgentP on 3/29/2016.
 */
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Long> {
}
