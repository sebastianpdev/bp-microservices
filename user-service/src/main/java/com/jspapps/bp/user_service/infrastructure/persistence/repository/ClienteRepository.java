package com.jspapps.bp.user_service.infrastructure.persistence.repository;

import com.jspapps.bp.user_service.infrastructure.persistence.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findFirstByNombreEqualsIgnoreCase(String nombre);

}
