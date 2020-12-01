package com.raju.springmvc.repository;

import com.raju.springmvc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Integer> {
    User findByEmail(String email);
    User findByUserName(String userName);

}
