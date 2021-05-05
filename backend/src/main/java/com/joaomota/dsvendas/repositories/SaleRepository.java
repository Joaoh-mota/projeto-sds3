package com.joaomota.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomota.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
}
