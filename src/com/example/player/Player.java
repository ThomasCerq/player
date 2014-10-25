package com.example.player;

import com.example.util.ObjectifyEntity;
import com.googlecode.objectify.annotation.Entity;

/**
 * This class is used to represent a player. 
 * A player consist of a name, a rank, and a value. 
 * @author Thomas
 * @version 2
 */
@Entity
public class Player extends ObjectifyEntity {
	
	protected String name;
	protected Integer rank;
	protected Float score;
	
	public Player(String name, Integer rank, Float score) {
		this.name = name;
		this.rank = rank;
		this.score = score;
	}

	public Player(){
		name = "";
		rank = -1;
		score = new Float(-1);
	}
	
	public String toString(){
		return name+", "+rank+", "+score;
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

	public Float getScore() {
		return score;
	}

	public void setScore(Float value) {
		this.score = value;
	}
	
}