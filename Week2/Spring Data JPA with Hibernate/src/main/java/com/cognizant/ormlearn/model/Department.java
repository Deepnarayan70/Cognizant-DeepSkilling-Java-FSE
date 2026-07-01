package com.cognizant.ormlearn.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "department")
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = "employees") // Exclude to prevent infinite recursion in toString
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Uses database Auto-Increment
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    // mappedBy indicates that the Department is NOT the owner of the relationship.
    // The "department" field in the Employee class owns the foreign key.
    // CascadeType.ALL ensures operations like save/delete on Department cascade down to its Employees.
    // FetchType.LAZY is standard for OneToMany to avoid hitting the DB unnecessarily until getEmployees() is called.
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore // Prevent infinite JSON serialization loops when sending back API responses
    private List<Employee> employees;
}
