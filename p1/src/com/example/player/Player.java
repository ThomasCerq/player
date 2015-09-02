package com.example.player; 

import com.example.util.ObjectifyEntity;
import com.googlecode.objectify.annotation.AlsoLoad;
import com.googlecode.objectify.annotation.Entity;

/**   
 * This class is used to represent a player. 
 * A player consists of a name, a rank, and a value. 
 * @author Thomas  
 * @version 5
 */
@Entity
public class Player extends ObjectifyEntity {
	
	protected String name;
	protected Integer rank;	
	@AlsoLoad("value")	
	protected Integer score; 
	protected String type; 
	
	public Player(String name, Integer rank, Integer score, String type) {
		this.name = name;
		this.rank = rank;
		this.score = score;
		this.type = type;
	}

	public Player(){ 
		name = "";
		rank = -1;
		score = -1;
		type = "";
	}
	
	@Override
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
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	/*
	 * ControVol
	 * 		(> Check consistency)
	 * 		> Register new version (-> XML for current version) -> Hidden folder contains XML files
	 * 		> ... 
	 */
}