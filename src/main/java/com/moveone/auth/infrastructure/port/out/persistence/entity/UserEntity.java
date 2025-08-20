package com.moveone.auth.infrastructure.port.out.persistence.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class UserEntity {
	private UUID idUser;
	private String username;
	private String password;
	private String email;
	private String role;
}
