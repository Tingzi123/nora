package com.noah.service;

import com.noah.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    User saveOrUpdateUser(User user);

    void deleteUser(int userId);

    User getUser(int userId);

    User getUserByUsername(String username);

    List<User> listUser();

    Page<User> listUserByUsernameLike(String username, Pageable pageable);

    User login(User user);

    User register(User user);
}
