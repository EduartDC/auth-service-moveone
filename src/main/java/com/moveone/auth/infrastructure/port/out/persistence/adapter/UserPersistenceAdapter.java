package com.moveone.auth.infrastructure.port.out.persistence.adapter;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.moveone.auth.application.port.out.GetUserPort;
import com.moveone.auth.domain.model.User;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UserPersistenceAdapter implements GetUserPort{@Override

	public Optional<User> getUserByName(String username) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getUserByName'");
	}
}
