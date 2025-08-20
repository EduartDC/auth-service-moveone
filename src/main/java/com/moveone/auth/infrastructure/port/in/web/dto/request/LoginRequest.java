package com.moveone.auth.infrastructure.port.in.web.dto.request;

import jakarta.validation.constraints.NotBlank;

public class LoginRequest {
		@NotBlank(message = "El nombre de usuario es obligatorio")
	private String username;

	@NotBlank(message = "La contraseña es obligatoria")
	private String password;
}
