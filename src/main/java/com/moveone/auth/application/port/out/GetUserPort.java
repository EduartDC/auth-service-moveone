package com.moveone.auth.application.port.out;

import java.util.Optional;

import com.moveone.auth.domain.model.User;

public interface GetUserPort {
	Optional<User> getUserByName(String username);
}
