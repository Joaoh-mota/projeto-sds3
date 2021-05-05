package com.joaomota.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomota.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {
	
}
