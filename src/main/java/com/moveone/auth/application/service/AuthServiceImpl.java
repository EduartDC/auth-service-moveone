package com.moveone.auth.application.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.moveone.auth.application.port.in.LoginUseCase;
import com.moveone.auth.infrastructure.port.in.web.dto.response.LoginResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements LoginUseCase{
	
	//private final LoadUserPort loadUserPort;  // puerto salida: cargar usuario
  //private final SaveUserPort saveUserPort;  // puerto salida: guardar cambios si aplica
  //private final PasswordEncoder passwordEncoder;
  //private final JwtProvider jwtProvider;

	//se inyectan todos estos metodos para poder implementar la logica de negocio de la autenticacion.

	@Override
	public LoginResponse login(String username, String password) {
		// Implement your login logic here
		return null;
	}
}
