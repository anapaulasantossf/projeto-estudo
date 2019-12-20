package com.example.demo.service;

import com.example.demo.data.Usuario;
import com.google.common.base.Optional;

public interface UsuarioService {	
	
	/**
	* Busca e retorna um usuário dado um email.
	* @param email
	* @return Optional<Usuario>
	*/
	Optional<Usuario> buscarPorEmail(String email);

}
