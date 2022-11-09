package com.project.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.demo.model.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {

}