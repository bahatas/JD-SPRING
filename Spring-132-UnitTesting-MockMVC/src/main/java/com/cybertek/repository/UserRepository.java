package com.cybertek.repository;



import com.cybertek.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface UserRepository extends JpaRepository<User,Long> {

    @Transactional
    void deleteByUsername(String username);


    User findByUserName(String description);
}
