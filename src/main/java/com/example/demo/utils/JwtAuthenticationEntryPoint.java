package com.example.demo.utils;

import java.io.IOException;

import javax.naming.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JwtAuthenticationEntryPoint {
	
	public void commence(HttpServletRequest request, 
					HttpServletResponse response, 
					AuthenticationException authException) throws IOException {		
		
		response.sendError(HttpServletResponse.SC_UNAUTHORIZED,	
					"Acesso negado. Você deve estar autenticado no sistema" +
					"para acessar a URL solicitada.");
	}

}
