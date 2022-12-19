/***
 * @Autor: ittai vazquez
 * @since 2022-12-18
 * @version 1.0
 * This is a main entity, this is the class to map the database.
 */
package org.mycompany.myproduct.Models.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="project_structure")
public class MyBoard implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="projectIDaudit")
    private String projectIDaudit;

    @Column(name="projectName" )
    private String projectName;

    @Column(name="descriptionProject")
    private String descriptionProject;

    @Column(name="priority")
    private String priority;

    @Column(name="workflow")
    private String workflow;

    @Column(name="date_start")
    private String dateStart;

    @Column(name="date_end")
    private String dateEnd;

    @Column(name="date_update")
    private String dateUpdate;


}

