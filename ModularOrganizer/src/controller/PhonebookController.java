package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import model.PhonebookData;
import model.PhonebookEntry;
import model.PhonebookModel;
import view.PhonebookView;

public class PhonebookController {
	private PhonebookModel model;
	private PhonebookView view;
	public PhonebookController(PhonebookModel model, PhonebookView view){
		this.model = model;
		this.view = view;
		
		this.view.getAddTaskButton().addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				int index = view.getList().getSelectedIndex();
				model.addEntry(view.getAddPhoneNumber().getText().replaceAll("\\D", ""), view.getAddContactName().getText());
				model.savePhonebook();
				refreshPhonebook(index);
				
				view.getFrame().setVisible(true);
				
			}
		});
		
		
		refreshPhonebook(0);
		
		
		
		this.view.getRemoveContactButton().addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (view.getList().getSelectedIndex()!=-1){
					
				 int index = view.getList().getSelectedIndex();
				 PhonebookData.getDat().remove(index);
				 view.getList().setSelectedIndex(index);
				 view.getList().indexToLocation(index);
				 model.savePhonebook();
				 refreshPhonebook(index);
				 view.getFrame().setVisible(true);
				 
				}
			}
			});
		this.view.getEditButton().addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (view.getList().getSelectedIndex()!=-1){
					int index = view.getList().getSelectedIndex();
					String name=view.getAddContactName().getText();
					name=model.uniqueName(name);
					PhonebookData.getDat().get(index).setName(name);
					view.getAddContactName().getText();
							 model.savePhonebook();
							 refreshPhonebook(index);
							 view.getFrame().setVisible(true);
				}
			}
		});
		this.view.getEditNButton().addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (view.getList().getSelectedIndex()!=-1){
					int index = view.getList().getSelectedIndex();
					PhonebookData.getDat().get(index).setNumber(view.getAddPhoneNumber().getText().replaceAll("\\D", ""));
			
							 model.savePhonebook();
							 refreshPhonebook(index);
							 view.getFrame().setVisible(true);
				}
			}
		});
	}
	public void refreshPhonebook(int idex){
		view.getFrame().remove(view.getTextField());
		
		model.getData().getData().clear();
		for(PhonebookEntry p : model.getData().getDat()){
			model.getData().getData().addElement(p.getName()+" "+p.getNumber());
			int index = model.getData().getDat().indexOf(p);
		}
		view.setList(new JList(model.getData().getData()));

	    view.getList().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		view.getList().setSelectedIndex(0);
		
		view.getList().setSelectedIndex(idex);
		view.setTextField(new JScrollPane(view.getList()));
		view.getTextField().setBounds(50, 50, 350, 350);
		view.getFrame().add(view.getTextField());
	}
	public PhonebookModel getModel() {
		return model;
	}
	public void setModel(PhonebookModel model) {
		this.model = model;
	}
	public PhonebookView getView() {
		return view;
	}
	public void setView(PhonebookView view) {
		this.view = view;
	}
}//end of class
