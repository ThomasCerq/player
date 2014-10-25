package com.example.player;

import com.example.util.ObjectifyEntity;
import com.googlecode.objectify.annotation.AlsoLoad;
import com.googlecode.objectify.annotation.Entity;

/**
 * This class is used to represent a player. 
 * A player consist of a name, a rank, and a value. 
 * @author Thomas
 * @version 4
 */
@Entity
public class Player extends ObjectifyEntity {
	
	protected String name;
	protected Integer rank;
	@AlsoLoad("value")
	protected Integer score;
	
	public Player(String name, Integer rank, Integer score) {
		this.name = name;
		this.rank = rank;
		this.score = score;
	}

	public Player(){
		name = "";
		rank = -1;
		score = -1;
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

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer value) {
		this.score = value;
	}
	
}