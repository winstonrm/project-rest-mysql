package com.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.project.demo.model.Pessoa;
import com.project.demo.service.PessoaService;


@RestController
@RequestMapping(path="/pessoa")
public class PessoaController {
    
	private static final Logger LOGGER = LoggerFactory.getLogger(PessoaController.class);
	
	@Autowired
	private PessoaService pessoaService;
    
    @PostMapping
    public @ResponseBody ResponseEntity<Pessoa> addNewPessoa(@RequestBody Pessoa pessoa){
    	
    	try {	
	        Pessoa pessoaDB = pessoaService.save(pessoa);
	        return new ResponseEntity<Pessoa>(pessoaDB, HttpStatus.CREATED);
    	} catch( RuntimeException runtimeException) {
    		runtimeException.printStackTrace();
    		LOGGER.error(runtimeException.getMessage());
    		return new ResponseEntity<Pessoa>(HttpStatus.INTERNAL_SERVER_ERROR);
    	}

    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Pessoa> getAllPessoa() {
        return pessoaService.findAll();
    }
}
