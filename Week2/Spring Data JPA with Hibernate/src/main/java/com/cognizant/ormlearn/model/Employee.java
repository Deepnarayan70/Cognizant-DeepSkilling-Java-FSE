package com.cognizant.ormlearn.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "salary", nullable = false)
    private Double salary;

    // @Temporal is used for Date and Time mappings (DATE, TIME, TIMESTAMP)
    @Temporal(TemporalType.DATE)
    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    // Many Employees belong to One Department
    // @JoinColumn creates the actual foreign key column in the employee table named "department_id"
    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;
    
    // @Transient means this field is NOT saved to the database. It exists only in Java memory.
    @Transient
    private Integer age;
}
