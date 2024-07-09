package com.Commerce.commerce.Entity;

import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor

@Data

@Entity


public class Product {
@Id @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private double price;
     private String description;
     @ManyToOne @JoinColumn(name = "owner_id")
     private Client owner;
}
