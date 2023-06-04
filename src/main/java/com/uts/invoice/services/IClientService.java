package com.uts.invoice.services;

import java.util.List;
import com.uts.invoice.models.entities.Client;
import com.uts.invoice.models.entities.Invoice;
import com.uts.invoice.models.entities.Product;
import com.uts.invoice.models.entities.Region;

public interface IClientService {
	
	public List<Client> findAll();
	
	public Client findById(Long id);
	
	public Client save(Client client);
	
	public void delete(Client client);
	
	public List<Region> findAllRegions();
	
	public Invoice findInvoiceById(Long id);
	
	public List<Invoice> findAllInvoices();
	
	public Invoice saveInvoice(Invoice invoice);
	
	public void deleteInvoiceById(Long id);
	
	public List<Product> findProductByName(String term);

}
