package com.jspapps.bp.user_service.infrastructure.persistence.dao;

import com.jspapps.bp.user_service.domain.model.ClienteQuery;
import com.jspapps.bp.user_service.domain.repository.IClienteQueryDAO;
import com.jspapps.bp.user_service.infrastructure.persistence.mapper.ClienteMapper;
import com.jspapps.bp.user_service.infrastructure.persistence.model.Cliente;
import com.jspapps.bp.user_service.infrastructure.persistence.repository.ClienteRepository;
import com.jspapps.bp.user_service.infrastructure.util.annotation.PersistenceAdapter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@PersistenceAdapter
public class ClienteQueryDAO implements IClienteQueryDAO {

    private final ClienteRepository clienteRepository;
    private final ClienteMapper clienteMapper;

    @Override
    public ClienteQuery validateClienteByNombre(String nombre) {
        Cliente cliente = clienteRepository.findFirstByNombreEqualsIgnoreCase(nombre).orElse(null);
        return clienteMapper.toQuery(cliente);
    }
}
