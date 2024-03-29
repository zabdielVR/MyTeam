package org.mycompany.myproduct.Models.Entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "roles")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 60)
    private String nombre;
}
