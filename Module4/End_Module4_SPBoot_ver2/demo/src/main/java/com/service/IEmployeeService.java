package com.service;

import com.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmployeeService extends IService<Employee> {
    void save(Employee employee, int idBranch);
    Page<Employee> getAll(Pageable pageable);
}
