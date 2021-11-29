package com.devsuperior.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.services.SellerService;

@RestController
@RequestMapping(value = "/sellers") // caminho do recurso web.
public class SellerController {

	@Autowired
	private SellerService service;

	@GetMapping // chamar o caminho no navegador = getmapping
	public ResponseEntity<List<SellerDTO>> findAll() { // tipo especial de resposta responseentity
		List<SellerDTO> list = service.findAll();
		return ResponseEntity.ok(list); //lista no corpo da resposta
	}

}
