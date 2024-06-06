package com.jspapps.bp.user_service.domain.repository;

import com.jspapps.bp.user_service.domain.model.ClienteQuery;

public interface IClienteQueryDAO {

    ClienteQuery validateClienteByNombre(String nombre);
}
