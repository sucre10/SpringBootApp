package com.example.SpringBootApp.repository;

import com.example.SpringBootApp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @Repository: el repository la capa de persistencia que tiene acceso a los datos y que puede manipularlos.
 *
 * Como un repositorio suna interface y , no puede tener codigo
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{//repositorio asociado a User

    ////METODOS que se crean en repositorio PARA REALIZAR BUSQUEDASen la base de datos Car...
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
