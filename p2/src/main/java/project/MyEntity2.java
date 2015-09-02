package project;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class MyEntity2 extends AbstractClass {

	@Id
	public String id;
	
}
