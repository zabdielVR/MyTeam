package org.mycompany.myproduct.Models.Repository;


import org.mycompany.myproduct.Models.Entity.MVP;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MvpRepository extends JpaRepository<MVP, Long> {
}
