package com.tactfactory.monprojetsb2.monprojetsb2.bo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String firstName;
	private String lastName;
    
	@OneToMany
	private List<Product> listProduit;
	
	

}
