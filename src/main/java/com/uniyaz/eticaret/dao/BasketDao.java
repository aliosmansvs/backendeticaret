package com.uniyaz.eticaret.dao;

import com.uniyaz.eticaret.entity.Basket;
import com.uniyaz.eticaret.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BasketDao extends JpaRepository<Basket,Long> {

    @Query("select basket from Basket basket " +
            "left join fetch  basket.product product" +
            "left join fetch  basket.user user  " )
    List<Basket> findAllProductFromBasket();

    Basket save(Basket basket);
    void deleteById(Long id);

}
