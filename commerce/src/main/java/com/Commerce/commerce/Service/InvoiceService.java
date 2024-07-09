package com.Commerce.commerce.Service;

import com.Commerce.commerce.Entity.Invoice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.OptionalLong;

@Service

public class InvoiceService {
    @Autowired
    private InvoiceService invoiceRepository;
    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    private List<Invoice> findAll() {
        return null;
    }

    public OptionalLong getInvoiceById(Long id) {
        return invoiceRepository.findById(id);
    }

    private OptionalLong findById(Long id) {
        return null;
    }

    public InvoiceService(InvoiceService invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public Invoice saveInvoice(Invoice invoice) {
        return invoiceRepository.saveInvoice(invoice);
    }

    public void deleteInvoice(Long id) {
        invoiceRepository.deleteInvoice();
    }

    private void deleteInvoice() {
    }


}
