//Author: Damian Piela 
package model;

import java.io.Serializable;

/**
 * Class that allows to store a single priority created by user.
 * 
 * @author Damian Piela
 *
 */
public class Priority implements Serializable {
	
	private int level;
	private String name;
	
	/**
	 * Constructor for the Priority class.
	 * 
	 * @param level Integer that describes the level of importance of a task.
	 * @param name  String which is a name of the task.
	 */
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
