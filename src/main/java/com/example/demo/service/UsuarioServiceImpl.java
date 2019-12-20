package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

import com.example.demo.data.Usuario;
import com.example.demo.repository.UsuarioRepository;
import com.google.common.base.Optional;

public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository UsuarioRepository;
	
	
	public Optional<Usuario> buscarPorEmail(String email) {

		return Optional.fromNullable(this.UsuarioRepository.findByEmail(email));
	}

}
