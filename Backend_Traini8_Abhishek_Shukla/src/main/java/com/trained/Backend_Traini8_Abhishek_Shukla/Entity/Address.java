package com.trained.Backend_Traini8_Abhishek_Shukla.Entity;


import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "address")
@Data
@Getter
@Setter
public class Address {

   @NotNull(message = "Detailed Address is required")
    private String DetailedAddress;

   @NotNull(message = "City is required")
   private String city;

   @NotNull(message = "State is required")
   private String state;

   @NotNull(message = "Pincode is required")
   private String PinCode;
}
