/***
 * @Autor: ittai vazquez
 * @since 2022-12-18
 * @version 1.0
 * This Interface implements a DTO to principal Entity
 */
package org.mycompany.myproduct.Models.Dao;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Data
public class MyBoardDTO {

    private Long id;
    private String projectIDaudit;
    private String projectName;
    private String descriptionProject;
    private String priority;
    private String workflow;
    private String dateStart;
    private String dateEnd;
    private String dateUpdate;

}
