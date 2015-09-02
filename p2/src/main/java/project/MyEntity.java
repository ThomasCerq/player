package project;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.IgnoreSave;
import com.googlecode.objectify.annotation.OnLoad;

@Entity
public class MyEntity {

	@Id
	String id;
	
	Integer attributeInteger;
	
	@IgnoreSave
	String attribute;
	
	@OnLoad
	protected void migrateAttribute(){
		if (attributeInteger == null){
			attributeInteger = convertAttribute(attribute);
		}
	}
	
	protected Integer convertAttribute(String s){
		Integer i = null;
		// TODO Implement the conversion between String and Integer
		return i;
	}

}