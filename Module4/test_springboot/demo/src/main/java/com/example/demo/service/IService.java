package com.example.demo.service;

import java.util.List;

public interface IService<E> {
    List<E> getAll();
    void delete(int id);
    void add(E e);
    E update(E e);
    E findById(int id);
}
