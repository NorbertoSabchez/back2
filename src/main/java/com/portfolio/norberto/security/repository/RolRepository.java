
package com.portfolio.norberto.security.repository;

import com.portfolio.norberto.security.enums.RolNombre;
import com.portfolio.norberto.security.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
