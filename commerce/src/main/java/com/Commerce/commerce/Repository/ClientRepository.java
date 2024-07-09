package com.Commerce.commerce.Repository;

import com.Commerce.commerce.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
