//Author: Damian Piela
package model;

import java.io.Serializable;
import java.util.ArrayList;

public class PrioritiesData implements Serializable {
	
	public ArrayList<Priority> data;
	
	public PrioritiesData(){
		this.data = new ArrayList<Priority>();
	}
	
}//end of class
