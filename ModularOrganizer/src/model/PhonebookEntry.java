package model;
import java.io.Serializable;
/**Class for holding data of a single phonebook entry.
 * @author Cinek
 *
 */
public class PhonebookEntry implements Serializable {
	
	private String number;
	private String name;
	
	public String getNumber() {
		return number;
	}

	/**Setter for the number.
	 * @param number argument of PhonebookEntry class, stores only digital data, associated with Action Listeners of PhonebookControler
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	/**Constructor for the PhonebookEntry class.
	 * @param number argument of PhonebookEntry class, stores only digital data, associated with Action Listeners of PhonebookControler
	 * @param name argument of PhonebookEntry class
	 */
	public PhonebookEntry(String number, String name){
		this.number = number;
		this.name = name;
	}
}
