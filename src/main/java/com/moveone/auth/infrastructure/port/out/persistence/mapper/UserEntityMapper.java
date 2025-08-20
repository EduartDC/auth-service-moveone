package com.moveone.auth.infrastructure.port.out.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.moveone.auth.domain.model.User;
import com.moveone.auth.infrastructure.port.out.persistence.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {
	// De entidad JPA a dominio
    @Mapping(source = "idUser", target = "idUser")
    User toDomain(UserEntity entity);

    // De dominio a entidad JPA
    @Mapping(source = "idUser", target = "idUser")
    UserEntity toEntity(User domain);
}
