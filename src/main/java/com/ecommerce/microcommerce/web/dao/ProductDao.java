package com.ecommerce.microcommerce.web.dao;

import com.ecommerce.microcommerce.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends JpaRepository<Produit, Integer> {
   
}
