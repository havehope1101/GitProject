package com.example.demo.service;

import com.example.demo.entity.Role;
import com.example.demo.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

        @Autowired
        private IRoleRepository iRoleRepository;

        public Role findById(int id){
            return iRoleRepository.findById(id).get();
        }
    }

