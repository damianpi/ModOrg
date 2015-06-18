//Author: Damian Piela
package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * A serializable library for storing Priority-type objects. 
 * 
 * @author Damian Piela
 *
 */
public class PrioritiesData implements Serializable {
	
	private ArrayList<Priority> data;
	
	/**
	 * Constructor for the PrioritiesData class
	 */
	public PrioritiesData(){
		this.data = new ArrayList<Priority>();
	}//end of constructor
	
	//getters and setters
	public ArrayList<Priority> getData() {
		return data;
	}

	public void setData(ArrayList<Priority> data) {
		this.data = data;
	}
	
}//end of class
