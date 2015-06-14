package model;
import java.io.Serializable;
package model;
import java.io.Serializable;
public class PhonebookEntry implements Serializable {
	
	private String number;
	private String name;
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public PhonebookEntry(String number, String name){
		this.number = number;
		this.name = name;
	}
}
