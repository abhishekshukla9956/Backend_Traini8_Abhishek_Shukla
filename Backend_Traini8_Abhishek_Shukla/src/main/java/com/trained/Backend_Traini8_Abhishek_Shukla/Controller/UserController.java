package com.trained.Backend_Traini8_Abhishek_Shukla.Controller;

import com.trained.Backend_Traini8_Abhishek_Shukla.Entity.UserEntity;
import com.trained.Backend_Traini8_Abhishek_Shukla.Services.UserService;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/training-center")
@Validated
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping
    public ResponseEntity<UserEntity> createCenter(@Valid @RequestBody UserEntity user){
        user.setCreatedOn(Instant.now());   //Ensures server-generated time
      UserEntity savedcenter = userService.saveEntry(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedcenter);
    }

    @GetMapping
    public ResponseEntity<List<UserEntity>> getAll(){
        List<UserEntity> userEntityList = userService.getall();
        return ResponseEntity.ok(userEntityList);
    }





    @ExceptionHandler(ConstraintViolationException.class)
    public  ResponseEntity<String> handleValidExceptions(ConstraintViolationException ex){
        return new ResponseEntity<>("Validation error : " +ex.getMessage(),HttpStatus.BAD_REQUEST);
    }
}
