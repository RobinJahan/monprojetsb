package com.tactfactory.monprojetsb2.monprojetsb2.bo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Product {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private float price;

}
