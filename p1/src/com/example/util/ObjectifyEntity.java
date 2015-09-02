package com.example.util;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public abstract class ObjectifyEntity {

	//****************
	//** Attributes **
	//****************

	@Id
	protected Long key; 

	//******************
	//** Constructors **
	//******************
	
	public ObjectifyEntity(){}
	
	//****************
	//** Attributes **
	//****************
	
	public Long getKey(){
		return this.key;
	}
	
}
