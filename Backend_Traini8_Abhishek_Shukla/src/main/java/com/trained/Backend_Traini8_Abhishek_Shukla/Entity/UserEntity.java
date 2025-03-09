package com.trained.Backend_Traini8_Abhishek_Shukla.Entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.List;


@Document(collection = "trainingcenter")
@Getter
@Setter
@Data
public class UserEntity {

    @Id
    private ObjectId id;

    @NotNull(message = "CenterName is required")
    @Size(min = 1, max = 40,message = "CentreName must be less than 40 characters")   //using jakarta validation to fix size
    private String CenterName;

    @NotNull(message = "CenterCode is required")
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$",message ="CentreCode must be exactly 12 alphanumeric characters " ) // Using Pattern annotation to set alphanumeric characters of size 12
    private String CenterCode;


    @NotNull(message = "Address is required")
    private Address Address;

    private Integer StudentCapacity;

    private List<String> CoursesOffered;

    private Instant CreatedOn;    // Epoch time generated by System

    @Email(message = "Invalid email format")
    private String ContactEmail;

    @NotNull(message = "Phone Number is required")
    @Pattern(regexp = "^\\d{10}$", message = "Valid 10 digit number is required")
    private String ContactPhone;
}
