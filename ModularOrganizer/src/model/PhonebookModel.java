package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.util.ArrayList;

public class PhonebookModel {
	
	public PhonebookData data;
	
	
	public PhonebookModel(){
		this.data = new PhonebookData();
		
		try{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/ModularOrganizer/Phonebook/Phonebook.pd"));
			data.dat = (ArrayList<PhonebookEntry>)in.readObject();
			in.close();
		}catch(Exception e){}
		
	}
	
	public void addEntry(String level, String name){
		PhonebookEntry Entry = new PhonebookEntry(level, name);
		data.data.addElement(Entry.number+Entry.name);
		data.dat.add(Entry);
		
	}
	
	public void savePhonebook(){
		File location = new File("C:/ModularOrganizer/Phonebook");
		
		if(location.exists()){
			try{
				Files.delete(location.toPath());
			}catch(Exception e){}
			
			location.mkdirs();
		}else{
			location.mkdirs();
		}
		
		try{
			ArrayList<PhonebookEntry> pd=data.dat;
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:/ModularOrganizer/Phonebook/Phonebook.pd"));
			out.writeObject(pd);
			out.close();
		}catch(Exception e){}
		
	}
}
