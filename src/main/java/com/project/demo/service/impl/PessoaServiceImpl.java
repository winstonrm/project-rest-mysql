package com.project.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.model.Pessoa;
import com.project.demo.repository.PessoaRepository;
import com.project.demo.service.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService{
    @Autowired
    private PessoaRepository pessoaRepository;

	@Override
	public Pessoa save(Pessoa p) {
		// TODO Auto-generated method stub
		return pessoaRepository.save(p);
	}
 
	@Override
	public Iterable<Pessoa> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}

