package com.uniyaz.eticaret.dao;

import com.uniyaz.eticaret.entity.Product;
import com.uniyaz.eticaret.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopDao extends JpaRepository<Shop,Long> {

    List<Shop> findAll();
    Shop save(Shop shop);


}
