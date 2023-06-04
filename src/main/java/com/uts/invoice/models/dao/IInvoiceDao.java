package com.uts.invoice.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.uts.invoice.models.entities.Invoice;

public interface IInvoiceDao extends CrudRepository<Invoice,Long> {


}
