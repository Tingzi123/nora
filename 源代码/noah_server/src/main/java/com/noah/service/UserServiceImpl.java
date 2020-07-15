package com.noah.service;

import com.noah.model.User;
import com.noah.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public User saveOrUpdateUser(User user) {
        return userRepository.save(user);
    }

    @Transactional
    @Override
    public void deleteUser(int userId) {
        userRepository.delete(userId);
    }

    @Override
    public User getUser(int userId) {
        return userRepository.findOne(userId);
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> listUser() {
        return userRepository.findAll();
    }

    @Override
    public Page<User> listUserByUsernameLike(String username, Pageable pageable) {
        username="%"+username+"%";
        return userRepository.findByUsernameLike(username,pageable);
    }

    @Override
    public User login(User user) {
        User userDb=userRepository.findByUsername(user.getUsername());
        if(userDb==null){
            return null;
        }else if((user.getUsername().equals(userDb.getUsername()) && (user.getPassword().equals(userDb.getPassword())))){
            return userDb;
        }else {
            return null;
        }
    }

    @Transactional
    @Override
    public User register(User user) {
        User userDb=userRepository.findByUsername(user.getUsername());
        if(userDb==null){
            userRepository.save(user);
            return user;
        }else {
            return null;
        }
    }
}
