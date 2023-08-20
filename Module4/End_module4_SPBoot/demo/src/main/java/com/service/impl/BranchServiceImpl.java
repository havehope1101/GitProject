package com.service.impl;

import com.entity.Branch;
import com.repository.BranchRepository;
import com.service.IBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchServiceImpl implements IBranchService {
    @Autowired
    BranchRepository branchRepository;

    @Override
    public List<Branch> getAll() {
        return (List<Branch>) branchRepository.findAll();
    }

    @Override
    public void save(Branch branch) {
        branchRepository.save(branch);
    }

    @Override
    public void edit(Branch branch) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Branch findById(int id) {
        return branchRepository.findById(id).get();
    }
}
