package model;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**A serializable library for storing PhonebookEntry-type objects. 
 * @author Cinek
 *
 */
public class PhonebookData implements Serializable {
	
	private static ArrayList<PhonebookEntry> dat;
	private static DefaultListModel data;
	
	/**Constructor for the PhonebookData class
	 * 
	 */
	public PhonebookData(){
		this.setData(new DefaultListModel());
		this.setDat(new ArrayList<PhonebookEntry>());
	}
	public DefaultListModel Make (PhonebookEntry g) { 
	return null;
	}
	public static ArrayList<PhonebookEntry> getDat() {
		return dat;
	}
	public static void setDat(ArrayList<PhonebookEntry> dat) {
		PhonebookData.dat = dat;
	}
	public static DefaultListModel getData() {
		return data;
	}
	public static void setData(DefaultListModel data) {
		PhonebookData.data = data;
	}
	
}
