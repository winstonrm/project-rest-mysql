package com.project.demo.controller.repository.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.demo.model.Pessoa;

public interface UserRepository extends CrudRepository<Pessoa, Integer> {

}