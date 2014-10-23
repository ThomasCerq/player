package com.example.player;

import com.example.util.ObjectifyEntity;
import com.googlecode.objectify.annotation.Entity;

/**
 * 
 * @author Thomas
 * @version 2
 * 
 */
@Entity
public class Player extends ObjectifyEntity {
	
	protected String name;
	protected Integer rank;
	protected Float value;
	
	public Player(String name, Integer rank, Float value) {
		this.name = name;
		this.rank = rank;
		this.value = value;
	}

	public Player(){
		name = "";
		rank = -1;
		value = new Float(-1);
	}
	
	public String toString(){
		return name+", "+rank+", "+value;
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
	
}