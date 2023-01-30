package org.mycompany.myproduct.Models.DTO;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Data
@Builder
public class MvpDTO {


    private long id;


    private  String idMvp;


    private String location;


    private String nameProject;


    private Date startDate;


    private Date endDate;


    private String costCenter;


    private String bubget;


    private String stakeHolder;


    private String productOwner;

}
