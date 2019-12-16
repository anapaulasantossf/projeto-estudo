package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Response;
import com.example.demo.dto.EmpresaDTO;

@RestController
@RequestMapping("/api/exemplo")
public class EmpresaController {
	
	@GetMapping(value = "/{nome}")
	public String exemplo(@PathVariable("nome") String nome) {
		return "Olá " + nome;
	}
	
	/*
	@PostMapping
	public ResponseEntity<EmpresaDTO> cadastrar(@RequestBody EmpresaDTO empresaDto) {
		empresaDto.setId(1L);
		return ResponseEntity.ok(empresaDto);
	}
	*/
	
	@PostMapping
	public ResponseEntity<Response<EmpresaDTO>> cadastrar(@Valid @RequestBody EmpresaDTO empresaDto, BindingResult result) {
		
		Response<EmpresaDTO> response = new Response<EmpresaDTO>();
		
		if (result.hasErrors()) {
			result.getAllErrors().forEach(error ->
			response.getErrors().add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}
		
		empresaDto.setId(1L);
		response.setData(empresaDto);
		return ResponseEntity.ok(response);
	}

}
