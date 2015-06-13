//Author: Damian Piela
package model;

import java.io.Serializable;
import java.util.ArrayList;

public class PrioritiesData implements Serializable {
	
	private ArrayList<Priority> data;
	
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
