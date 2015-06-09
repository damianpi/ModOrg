package model;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class PhonebookData implements Serializable {
	
	  public static ArrayList<PhonebookEntry> dat;
	  public static DefaultListModel data;
	
	public PhonebookData(){
		this.data = new DefaultListModel();
		this.dat = new ArrayList<PhonebookEntry>();
	}
	public DefaultListModel Make (PhonebookEntry g) { 
	return null;
	}
	
}
