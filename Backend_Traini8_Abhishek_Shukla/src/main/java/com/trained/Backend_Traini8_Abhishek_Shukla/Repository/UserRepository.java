package com.trained.Backend_Traini8_Abhishek_Shukla.Repository;

import com.trained.Backend_Traini8_Abhishek_Shukla.Entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<UserEntity,Object> {
    List<UserEntity> findAll();



}
