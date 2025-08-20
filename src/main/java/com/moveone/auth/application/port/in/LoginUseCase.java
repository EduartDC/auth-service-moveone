package com.moveone.auth.application.port.in;

import com.moveone.auth.infrastructure.port.in.web.dto.response.LoginResponse;

public interface LoginUseCase {

	/**
	 * Method to handle user login.
	 * @param username the username of the user
	 * @param password the password of the user
	 * @return a boolean indicating whether the login was successful
	 */
	LoginResponse login(String username, String password);
}
