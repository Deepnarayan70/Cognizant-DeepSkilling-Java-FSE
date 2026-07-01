package com.cognizant.ormlearn.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class EmployeeDTO {
    private String name;
    private Double salary;
    private Date dateOfBirth;
    private Long departmentId;
}
