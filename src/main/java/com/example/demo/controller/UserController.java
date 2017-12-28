package com.example.demo.controller;


import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public Object saveUser(String name,String pw){
        User user=new User();
        user.setName(name);
        user.setPw(pw);
        return userRepository.save(user);
    }

    @RequestMapping("/findall")
    public Object findAll(){
        return userRepository.findAll();
    }

}
