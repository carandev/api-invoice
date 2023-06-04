package com.uts.invoice.services;

import java.util.List;

import com.uts.invoice.models.entities.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uts.invoice.models.dao.IClientDao;
import com.uts.invoice.models.dao.IInvoiceDao;
import com.uts.invoice.models.dao.IProductDao;
import com.uts.invoice.models.entities.Client;
import com.uts.invoice.models.entities.Product;
import com.uts.invoice.models.entities.Region;


@Service
public class ClientServiceImpl implements IClientService {
	
	@Autowired
	private IClientDao clienteDao;
	
	@Autowired
	private IInvoiceDao facturaDao;
	
	
	@Autowired
	private IProductDao productoDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Client> findAll() {
		return (List<Client>)clienteDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Client findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Client save(Client client) {
		return clienteDao.save(client);
	}

	@Override
	public void delete(Client client) {
		clienteDao.delete(client);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<Region> findAllRegions() {
		return clienteDao.findAllRegions();
	}

	@Override
	@Transactional(readOnly=true)
	public Invoice findInvoiceById(Long id) {
		return facturaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Invoice> findAllInvoices() {
		return (List<Invoice>) facturaDao.findAll();
	}

	@Override
	@Transactional
	public Invoice saveInvoice(Invoice invoice) {
		return facturaDao.save(invoice);
	}

	@Override
	@Transactional
	public void deleteInvoiceById(Long id) {
		facturaDao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<Product> findProductByName(String term) {
		return productoDao.findByNameContainingIgnoreCase(term);
	}


}
