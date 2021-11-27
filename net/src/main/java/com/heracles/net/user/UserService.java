
package com.heracles.net.user;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {


    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    


    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public void addNewUser(User user){
        Optional<User> userOptional = userRepository.findUserByEmail(user.getEmail());
        if(userOptional.isPresent()){
            System.out.println("si funciono");
            throw new IllegalStateException("email taken");
        } 
        userOptional = userRepository.findUserByNickName(user.getUserName());
        if(userOptional.isPresent()){
            System.out.println("mismo nick name");
            throw new IllegalStateException("nick_name taken");
        } 
        userRepository.save(user);
        System.out.println("Agregadito");
    }
}
