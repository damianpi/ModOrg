//Author: Damian Piela 
package model;

import java.io.Serializable;

public class Priority implements Serializable {
	
	public int level;
	public String name;
	
	public Priority(int level, String name){
		this.level = level;
		this.name = name;
	}
	
	
}//end of class
