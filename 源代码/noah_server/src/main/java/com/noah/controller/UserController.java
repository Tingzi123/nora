package com.noah.controller;

import com.noah.model.Result;
import com.noah.model.User;
import com.noah.repository.UserRepository;
import com.noah.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class  UserController {
    private Result response;

    @Autowired
    private UserService userService;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/getUser/{userId}")
    public Result getUser(@PathVariable("userId") Integer userId) {
        // 用2.0这快会报错 换1.5就好了
        User user = userRepository.findOne(userId);
        response=new Result(1,"success",user);
        return response;
    }

    @GetMapping("/getUserByUsername/{username}")
    public Result getUserByUsername(@PathVariable("username") String username) {
        // 用2.0这快会报错 换1.5就好了
        User user = userService.getUserByUsername(username);
        response=new Result(1,"success",user);
        return response;
    }

    @PostMapping("/saveOrUpdateUser")
    public Result saveOrUpdateUser(User user) {
        User save = userRepository.save(user);
        response=new Result(1,"success",save);
        return response;
    }

    @GetMapping("/getAllUser")
    public Result getUserList() {
        List<User> listUser=new ArrayList<>();

        listUser=userRepository.findAll();
        response=new Result(1,"success",listUser);
        return response;
    }

    @GetMapping("/deleteUser/{userId}")
    public Result deleteUser(@PathVariable("userId") Integer userId) {
        // 用2.0这快会报错 换1.5就好了
       userRepository.delete(userId);
       response=new Result(1,"success",null);
        return response;
    }

    @PostMapping("/login")
    public Result login(User user) {
        List<User> listUser=new ArrayList<>();

        User save = userService.login(user);
        if(save==null){
            response=new Result(2,"fail",null);
        }else{
            listUser.add(save);
            response=new Result(1,"success",listUser);
        }
        return response;
    }

    @PostMapping("/register")
    public Result register(User user) {
        List<User> listUser=new ArrayList<>();

        User temp=userService.register(user);
        if(temp==null){
            response=new Result(2,"fail",null);
        }else{
            listUser.add(temp);
            response=new Result(1,"success",listUser);
        }
        return response;
    }

}