package com.service.impl;

import com.entity.Branch;
import com.entity.Employee;
import com.repository.BranchRepository;
import com.repository.EmployeeRepository;
import com.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    BranchRepository branchRepository;

    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public void save(Employee employee, int idBranch) {
        Branch branch = branchRepository.findById(idBranch).get();
        employee.setBranch(branch);
        employeeRepository.save(employee);
    }

    @Override
    public Page<Employee> getAll(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void save(Employee employee) {
    }

    @Override
    public void edit(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if(optionalEmployee.isPresent()) {
            return optionalEmployee.get();
        } else {
            return new Employee();
        }
    }
}
