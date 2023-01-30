package org.mycompany.myproduct.Models.Repository;

import org.mycompany.myproduct.Models.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {



    public Optional<Usuario> findByUsernameOrEmail(String username,String email);


    public Boolean existsByUsername(String username);

    public Boolean existsByEmail(String email);
}
