package com.uniyaz.eticaret.entity;


import javax.persistence.*;

@Entity
public class Basket extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long basketId;


    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    @JoinColumn(name = "productId")
    @org.hibernate.annotations.ForeignKey(name = "fk_basket_product")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    @JoinColumn(name = "userId")
    @org.hibernate.annotations.ForeignKey(name = "fk_basket_user")
    private User user;



    public void setBasketId(Long basketId) {
        this.basketId = basketId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "basketId=" + basketId +
                ", product=" + product +
                ", user=" + user +
                '}';
    }

    @Override
    public Long getId() {
        return basketId;
    }
}
