package com.uniyaz.eticaret.service;

import com.uniyaz.eticaret.dao.ProductDao;
import com.uniyaz.eticaret.dao.ShopDao;
import com.uniyaz.eticaret.entity.Basket;
import com.uniyaz.eticaret.entity.Product;
import com.uniyaz.eticaret.entity.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {
    @Autowired
    ShopDao shopDao;


    public List<Shop> findAllShop() {

        List<Shop> allShopList = shopDao.findAll();

        return allShopList;
    }

    public Shop save(Shop shop) {
        Shop savedShop = shopDao.save(shop);

        return savedShop;
    }

    public void deleteShop(Long id) {
        shopDao.deleteById(id);
    }
}
