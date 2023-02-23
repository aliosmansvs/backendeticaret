package com.uniyaz.eticaret.entity;

import javax.persistence.*;

@Entity
public class Shop extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shopId;

    @ManyToOne
    @JoinColumn(name = "basketId")
    @org.hibernate.annotations.ForeignKey(name = "fk_shop_basket")
    private Basket basket;

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopId=" + shopId +
                ", basket=" + basket +
                '}';
    }

    @Override
    public Long getId() {
        return null;
    }
}
