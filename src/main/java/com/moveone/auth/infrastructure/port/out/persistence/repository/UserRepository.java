package com.moveone.auth.infrastructure.port.out.persistence.repository;

import org.springframework.stereotype.Repository;

import com.moveone.auth.domain.model.User;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
	Optional<User> findByUsername(String username);
}
