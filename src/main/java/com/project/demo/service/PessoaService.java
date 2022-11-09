package com.project.demo.service;

import com.project.demo.model.Pessoa;

public interface PessoaService{

	Pessoa save(Pessoa p);

	Iterable<Pessoa> findAll();

}
