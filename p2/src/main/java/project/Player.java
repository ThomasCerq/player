package project;

import java.util.Date;

import com.googlecode.objectify.annotation.AlsoLoad;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Ignore;

@Entity
public class Player {

	@Id
	String login;
	
	String name;
	
	@AlsoLoad("level")
	Integer rank;
	
	@Ignore
	Float score;
	
}








