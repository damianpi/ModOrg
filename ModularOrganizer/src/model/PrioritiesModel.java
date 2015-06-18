//Author: Damian Piela
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;

/**
 * Model class for the Priorities module.
 * 
 * @author Damian Piela
 *
 */
public class PrioritiesModel {
	
	private PrioritiesData data;

	/**
	 * Constructor for the PrioritiesModel class. Upon creating, tries to load serialized data, if exist. 
	 */
	public PrioritiesModel(){
		this.data = new PrioritiesData();
		
		//loading serialized file
		try{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/ModularOrganizer/Priorities/priorities.pd"));
			data = (PrioritiesData)in.readObject();
			in.close();
		}catch(Exception e){}
	}//end of constructor

	/**
	 * Adds priority to a serializable library.
	 * 
	 * @param level
	 * @param name
	 */
	public void addPriority(int level, String name){
		if(level > 3) level = 3;
		if(level < 1) level = 1;
		Priority priority = new Priority(level, name);
		data.getData().add(priority);
	}
	
	/**
	 * Creates a new file containing priorities data, in place of the old one.
	 */
	public void savePriorities(){
		File location = new File("C:/ModularOrganizer/Priorities");
		
		if(location.exists()){
			try{
				Files.delete(location.toPath());
			}catch(Exception e){}
			
			location.mkdirs();
		}else{
			location.mkdirs();
		}
		
		try{
			PrioritiesData pd = data;
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:/ModularOrganizer/Priorities/priorities.pd"));
			out.writeObject(pd);
			out.close();
		}catch(Exception e){}
	}//end of savePriorities()

	//getters and setters
	public PrioritiesData getData() {
		return data;
	}

	public void setData(PrioritiesData data) {
		this.data = data;
	}
}//end of class
