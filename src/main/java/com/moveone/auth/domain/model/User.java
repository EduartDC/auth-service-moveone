package com.moveone.auth.domain.model;

import com.moveone.auth.domain.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {
	private final String username;
    private final String password;
    private final Role role;
}
