package com.ecommerce.microcommerce.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.microcommerce.exceptions.NoSuchElementFoundException;
import com.ecommerce.microcommerce.model.Produit;
import com.ecommerce.microcommerce.web.dao.ProductDao;

@RestController
public class ProductController {
	
	@ExceptionHandler(NoSuchElementFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ResponseEntity<String>handleNoSushElementFoundException(
			NoSuchElementFoundException exception
			){
		return ResponseEntity
				.status(HttpStatus.NOT_FOUND)
				.body(exception.getMessage());
	}

    @Autowired
    private ProductDao productDao;

    
    @GetMapping("/Produits")
    public List<Produit> listeProduits() {
        return productDao.findAll(); 
    }

   
    @GetMapping("/Produits/{id}")
    public Optional<Produit> afficherUnProduit(@PathVariable int id) {
        return  Optional.ofNullable(productDao.findById(id)
        		.orElseThrow(()->new NoSuchElementFoundException("id not found"))); 
       
    }

    
    @PostMapping("/Produits")
    public Produit ajouterProduit(@RequestBody Produit produit) {
        return productDao.save(produit);  
    }

   
    @PutMapping("/Produits")
    public Produit updateProduit(@RequestBody Produit produit) {
        return productDao.save(produit); 
    }


    @DeleteMapping("/Produits/{id}")
    public void supprimerProduit(@PathVariable int id) {
        productDao.deleteById(id);  
    }
}
