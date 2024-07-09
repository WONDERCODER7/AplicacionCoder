package com.Commerce.commerce.Entity;
import jakarta.persistence.*;
import jakarta.persistence.GenerationType;
import lombok.*;

import java.util.List;

@NoArgsConstructor @ToString @EqualsAndHashCode
@Data
@Entity
public class Client {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;
    @Getter @Setter private String name;
    @Getter @Setter private String email;
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Getter @Setter private List<Client> client;

}


