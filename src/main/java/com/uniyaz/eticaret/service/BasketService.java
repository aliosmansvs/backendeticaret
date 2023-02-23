package com.uniyaz.eticaret.service;

import com.uniyaz.eticaret.dao.BasketDao;
import com.uniyaz.eticaret.entity.Basket;
import com.uniyaz.eticaret.entity.Product;
import com.uniyaz.eticaret.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {

    @Autowired
    BasketDao basketDao;

    public List<Basket> findAllProductBasket(){
        List<Basket> findAllProductFromBasket = basketDao.findAllProductFromBasket();
        return  findAllProductFromBasket;

    }
    public List<Basket> findAllBasket() {

        List<Basket> allBasketList = basketDao.findAll();

        return allBasketList;
    }

    public Basket save(Product product) {
        User user = new User();
        user.setUserId(1L);

        Basket basket=new Basket();
        basket.setProduct(product);
        basket.setUser(user);
        Basket savedBasket = basketDao.save(basket);

        return savedBasket;
    }

    public void deleteBasket(Long id) {
        basketDao.deleteById(id);
    }
}
