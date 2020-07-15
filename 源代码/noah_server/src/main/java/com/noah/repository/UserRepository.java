package com.noah.repository;

import com.noah.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    Page<User> findByUsernameLike(String username,Pageable pageable);

    User findByUsername(String username);

}
