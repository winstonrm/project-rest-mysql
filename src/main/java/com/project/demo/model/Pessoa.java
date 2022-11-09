package com.project.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoa")
public class Pessoa { 
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "cd_pessoa")
    private Integer cdPessoa;
    
    @Column(name = "ds_pessoa")
    private String dsPessoa;

	public Integer getCdPessoa() {
		return cdPessoa;
	}

	public void setCdPessoa(Integer cdPessoa) {
		this.cdPessoa = cdPessoa;
	}

	public String getDsPessoa() {
		return dsPessoa;
	}

	public void setDsPessoa(String dsPessoa) {
		this.dsPessoa = dsPessoa;
	}

}
