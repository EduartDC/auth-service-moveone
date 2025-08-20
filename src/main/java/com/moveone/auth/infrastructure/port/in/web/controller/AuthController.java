package com.moveone.auth.infrastructure.port.in.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moveone.auth.application.port.in.LoginUseCase;
import com.moveone.auth.infrastructure.port.in.web.dto.request.LoginRequest;
import com.moveone.auth.infrastructure.port.in.web.dto.response.LoginResponse;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

	private final LoginUseCase loginUseCase;
	
	@PostMapping("/login")
	public LoginResponse Login(@Valid @RequestBody LoginRequest entity) {
		//TODO: process POST request
		return null;
	}
}
