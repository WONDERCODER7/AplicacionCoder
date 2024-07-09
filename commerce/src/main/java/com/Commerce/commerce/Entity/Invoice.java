package com.Commerce.commerce.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Data

@Entity

public class Invoice {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Getter @Setter private long id;
    @Getter @Setter private LocalDate date;

    @OneToMany
private List<Product> product;
    @ManyToOne
private Client client;
    @ManyToOne
private Cart cart;
}







