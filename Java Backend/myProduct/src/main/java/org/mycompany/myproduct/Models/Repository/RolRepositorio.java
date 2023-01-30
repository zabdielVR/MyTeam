package org.mycompany.myproduct.Models.Repository;

import org.mycompany.myproduct.Models.Entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolRepositorio extends JpaRepository<Rol, Long> {

    public Optional<Rol> findByNombre(String nombre);
}
