package com.cognizant.ormlearn.repository;

import com.cognizant.ormlearn.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    // JpaRepository provides CRUD + Pagination + Sorting + JPA specific features automatically
    // The first generic 'Department' is the Entity type.
    // The second generic 'Long' is the Primary Key data type.
}
