package com.uts.invoice.controllers;

import java.util.List;

import com.uts.invoice.models.entities.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uts.invoice.models.entities.Product;
import com.uts.invoice.services.IClientService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class FacturaRestController {

	@Autowired
	private IClientService clienteService;

	@GetMapping("/invoices/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Invoice show(@PathVariable Long id) {
		return clienteService.findInvoiceById(id);
	}
	
	@GetMapping("/invoices")
	@ResponseStatus(HttpStatus.OK)
	public List<Invoice> index() {
		return clienteService.findAllInvoices();
	}
	
	@DeleteMapping("/invoices/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		clienteService.deleteInvoiceById(id);
	}
	
	@GetMapping("/invoices/filter-products/{term}")
	@ResponseStatus(HttpStatus.OK)
	public List<Product> filtratProductos(@PathVariable String term) {
		return clienteService.findProductByName(term);
	}
	
	@PostMapping("/invoices")
	@ResponseStatus(HttpStatus.CREATED)
	public Invoice crear(@RequestBody Invoice invoice) {
		return clienteService.saveInvoice(invoice);
	}
	
	
	
	
	
}
