package project;

import com.external.project.ClassB;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class MyEntity3 extends ClassB {

	@Id
	public String id;
	
}
