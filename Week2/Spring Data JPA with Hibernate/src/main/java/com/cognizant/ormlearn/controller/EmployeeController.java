package com.cognizant.ormlearn.controller;

import com.cognizant.ormlearn.dto.EmployeeDTO;
import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.repository.DepartmentRepository;
import com.cognizant.ormlearn.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        Optional<Department> departmentOpt = departmentRepository.findById(employeeDTO.getDepartmentId());
        
        if (departmentOpt.isPresent()) {
            Employee emp = new Employee();
            emp.setName(employeeDTO.getName());
            emp.setSalary(employeeDTO.getSalary());
            emp.setDateOfBirth(employeeDTO.getDateOfBirth());
            emp.setDepartment(departmentOpt.get());
            
            Employee saved = employeeRepository.save(emp);
            return new ResponseEntity<>(saved, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        return employeeRepository.findById(id)
                .map(emp -> new ResponseEntity<>(emp, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody EmployeeDTO employeeDTO) {
        Optional<Employee> existingEmpOpt = employeeRepository.findById(id);
        if (existingEmpOpt.isPresent()) {
            Employee emp = existingEmpOpt.get();
            emp.setName(employeeDTO.getName());
            emp.setSalary(employeeDTO.getSalary());
            emp.setDateOfBirth(employeeDTO.getDateOfBirth());
            // Intentionally keeping department out of update for simplicity, could be added.
            
            Employee updated = employeeRepository.save(emp);
            return new ResponseEntity<>(updated, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        if(employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
