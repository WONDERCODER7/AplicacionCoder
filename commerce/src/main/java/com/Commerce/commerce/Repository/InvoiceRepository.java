package com.Commerce.commerce.Repository;

import com.Commerce.commerce.Entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository <Invoice, Long> {
}
