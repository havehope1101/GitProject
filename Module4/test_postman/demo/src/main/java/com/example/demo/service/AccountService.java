package com.example.demo.service;

import com.example.demo.entity.Account;
import com.example.demo.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    IAccountRepository iAccountRepository;

    public List<Account> getAll() {
        return (List<Account>) iAccountRepository.findAll();
    }

    public Account save(Account account) {
        return iAccountRepository.save(account);
    }

//    public Account edit(Account account) {
//        return iAccountRepository.
//    }

    public void delete(int id) {
        iAccountRepository.deleteById(id);
    }

}
