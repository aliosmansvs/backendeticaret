package com.uniyaz.eticaret.service;

import com.uniyaz.eticaret.dao.ProductDao;
import com.uniyaz.eticaret.dao.UserDao;
import com.uniyaz.eticaret.entity.Product;
import com.uniyaz.eticaret.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User save(User user) {
        User savedUser = userDao.save(user);

        return savedUser;
    }

    public void deleteUser(Long id) {
        userDao.deleteById(id);
    }

    public User userLogin(String userName,String userPassword){
        User loginUser = userDao.findbyLongin(userName, userPassword);

        return loginUser;
    }
}
