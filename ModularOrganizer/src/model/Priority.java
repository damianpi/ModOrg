//Author: Damian Piela 
package model;

import java.io.Serializable;

public class Priority implements Serializable {
	
	private int level;
	private String name;
	
	public Priority(int level, String name){
		this.level = level;
		this.name = name;
	}//end of constructor

	//getters and setters
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}//end of class
