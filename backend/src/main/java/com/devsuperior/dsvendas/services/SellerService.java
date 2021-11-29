package com.devsuperior.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired  //injeta dependencia de forma transparente / instancia injetada automaticamente pelo spring
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll(); //result = resultado da busca do BD
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList()); 
		// vai retornar no método a lista result; converter a lista em seller DTO. a funcao map converte coleção 
		//original em nova, coleção. pra cada x da lista original de seller, quero criar novo objeto, passando x como argumento
		//no fim, tem que converter stream denovo pra lista
	}
	

}
