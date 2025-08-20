package com.moveone.auth.infrastructure.port.in.web.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LoginResponse {
	private String token;
	private String role;
	private String username;
}
