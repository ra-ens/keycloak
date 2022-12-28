package com.abdelhakimrafik.productmanagementapp.repositories;

import com.abdelhakimrafik.productmanagementapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
