package com.example.test.dao;

import com.example.test.POJO.User;
import com.example.test.wrapper.UserWrapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface UserDao extends JpaRepository<User , Integer> {
    User findByEmailId(@Param("email") String email);
    List<UserWrapper> getAllUser();
    List<String>getAllAdmin();
    @Transactional
    @Modifying
    Integer updateStatus(@Param("status") String status,@Param("id") Integer id);
    User findByEmail(String email);

}
