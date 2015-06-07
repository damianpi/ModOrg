package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.JScrollPane;

import model.PhonebookData;
import model.PhonebookEntry;
import model.PhonebookModel;
import view.PhonebookView;

public class PhonebookController {
	PhonebookModel model;
	public PhonebookView view;
	public PhonebookController(PhonebookModel model, PhonebookView view){
		this.model = model;
		this.view = view;
		this.view.addTaskButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				model.addEntry(view.addPhoneNumber.getText(), view.addContactName.getText());
				model.savePhonebook();
				
				refreshPhonebook();
				
				view.frame.setVisible(true);
				
			}
		});
		
		
		refreshPhonebook();
		
		
		
		this.view.removeContactButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				 int index = view.list.getSelectedIndex();
				 System.out.println(index);
				 PhonebookData.dat.remove(index);
				 model.savePhonebook();
				 refreshPhonebook();
				 view.frame.setVisible(true);
			}
			});
		this.view.EditButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

				int index = view.list.getSelectedIndex();
				PhonebookData.dat.get(index).name=view.addContactName.getText();
			
							 model.savePhonebook();
							 refreshPhonebook();
							 view.frame.setVisible(true);
			}
		});
		this.view.EditNButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

				int index = view.list.getSelectedIndex();
				PhonebookData.dat.get(index).number=view.addPhoneNumber.getText();
			
							 model.savePhonebook();
							 refreshPhonebook();
							 view.frame.setVisible(true);
			}
		});
	}
	public void refreshPhonebook(){
		view.frame.remove(view.textField);
		
		model.data.data.clear();
		for(PhonebookEntry p : model.data.dat){
			model.data.data.addElement(p.name+" "+p.number);
			int index = model.data.dat.indexOf(p);
		}
		view.list=new JList(model.data.data);
		
		view.textField=new JScrollPane(view.list);
		view.textField.setBounds(50, 50, 350, 350);
		view.frame.add(view.textField);
	}
	
}//end of class
