package com.Commerce.commerce.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data

@Entity

public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List <Product> product;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Cart cart;
}
