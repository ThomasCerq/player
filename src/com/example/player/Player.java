package com.example.player;

import com.example.util.ObjectifyEntity;
import com.googlecode.objectify.annotation.Entity;

/**
 * 
 * @author Thomas
 * @version 1
 * 
 */
@Entity
public class Player extends ObjectifyEntity {
	
	protected String name;
	protected Integer rank;
	protected Float value;
	protected String type;
	
	public Player(String name, Integer rank, Float value, String type) {
		this.name = name;
		this.rank = rank;
		this.value = value;
		this.type = type;
	}

	public Player(){
		name = "";
		rank = -1;
		value = new Float(-1);
		type = "";
	}
	
	public String toString(){
		return name+", "+rank+", "+value+", "+type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}