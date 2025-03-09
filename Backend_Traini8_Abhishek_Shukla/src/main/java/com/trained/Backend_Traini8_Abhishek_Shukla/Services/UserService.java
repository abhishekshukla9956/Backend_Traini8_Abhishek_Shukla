package com.trained.Backend_Traini8_Abhishek_Shukla.Services;

import com.trained.Backend_Traini8_Abhishek_Shukla.Entity.UserEntity;
import com.trained.Backend_Traini8_Abhishek_Shukla.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity saveEntry(UserEntity userEntity){
      return  userRepository.save(userEntity);

    }

    public List<UserEntity> getall(){
        return userRepository.findAll();
    }


}
