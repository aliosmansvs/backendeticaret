package com.uniyaz.eticaret.service;

import com.uniyaz.eticaret.dao.ProductDao;
import com.uniyaz.eticaret.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductDao productDao;


    public List<Product> findAllProduct() {

            List<Product> allProductList = productDao.findAll();

        return allProductList;
    }

    public Product save(Product product) {
        Product savedProdct = productDao.save(product);

        return savedProdct;
    }

    public void deleteProduct(Long id) {
        productDao.deleteById(id);
    }


}
