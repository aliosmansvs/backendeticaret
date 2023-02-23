package com.uniyaz.eticaret.dao;

import com.uniyaz.eticaret.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Long> {

    User save(User user);

    void deleteById(Long id);

    @Query("select user from User user where " +
            "user.userName=:userName and  user.userPassword=:userPassword")
    User findbyLongin(@Param("userName") String userName,@Param("userPassword") String userPassword);

}
