package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;

public class PrioritiesModel {
	
	public PrioritiesData data;
	
	
	public PrioritiesModel(){
		this.data = new PrioritiesData();
		
		//loading serialized file
		try{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/ModularOrganizer/Priorities/priorities.pd"));
			data = (PrioritiesData)in.readObject();
			in.close();
		}catch(Exception e){}
		
	}//end of constr
	
	
	
	
	
	
	public void addPriority(int level, String name){
		if(level > 3) level = 3;
		if(level < 1) level = 1;
		Priority priority = new Priority(level, name);
		data.data.add(priority);
	}
	
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
	
	
}//end of class
