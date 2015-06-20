package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.util.ArrayList;

/**Model class for the phonebook module.
 * @author Cinek
 *
 */
public class PhonebookModel {
	
	private PhonebookData data;
	
	
	public PhonebookData getData() {
		return data;
	}

	public void setData(PhonebookData data) {
		this.data = data;
	}

	/**Constructor for the PhonebookModel class.
	 * Upon creating, tries to load serialized data, if exist.
	 */
	public PhonebookModel(){
		this.data = new PhonebookData();
		
		try{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/ModularOrganizer/Phonebook/Phonebook.pd"));
			data.setDat((ArrayList<PhonebookEntry>)in.readObject());
			in.close();
		}catch(Exception e){}
		
	}
	
	/**Adds PhonebookEntry to a serializable library.
	 * Checking the uniqueness of the name to crate unique name(" name' " is for second telephone number of this same contact).
	 * @param level
	 * @param name
	 */
	public void addEntry(String level, String name){
		
		name=uniqueName(name);
		PhonebookEntry Entry = new PhonebookEntry(level, name);
		data.getData().addElement(Entry.getNumber()+Entry.getName());
		data.getDat().add(Entry);
		
	}
	
	/**Checking the uniqueness of the name to crate unique name.
	 * @param name
	 * @return
	 */
	public String uniqueName(String name) {
		
		while(0==0){
			boolean t=false;
			for (PhonebookEntry nam : data.getDat()) {
			
		
//			
				if (name.equals(nam.getName()))
				{
					name=name+"'";
					t=true;
				}
//				else
//					return name;
//				}
			}
		if (t==false) return name;
		}
	}

	/**Creates a new file containing priorities data, in place of the old one.
	 * 
	 */
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
			ArrayList<PhonebookEntry> pd=data.getDat();
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:/ModularOrganizer/Phonebook/Phonebook.pd"));
			out.writeObject(pd);
			out.close();
		}catch(Exception e){}
		
	}
}
