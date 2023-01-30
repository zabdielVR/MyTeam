package org.fakecompany.fakemvp.Entitys;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Entity
@Data
@Table(name="MVP")
public class MVP implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="id_MVP")
    private  String idMvp;

    @Column(name="location")
    private String location;

    @Column(name="name_project")
    private String nameProject;

    @Column(name="star_date")
    private Date startDate;

    @Column(name="end_date")
    private Date endDate;

    @Column(name="cost_center")
    private String costCenter;

    @Column(name="budget")
    private String bubget;

    @Column(name="stake_holders")
    private String stakeHolder;

    @Column(name="product_owner")
    private String productOwner;

}

