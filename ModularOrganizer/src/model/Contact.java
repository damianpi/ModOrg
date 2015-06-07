package model;

import java.io.Serializable;

public class Contact implements Serializable {
	
	public String name, surname, phoneNumber, address, birthdate,
		likes, dislikes, wantsOnBirthday, education, canHelpWith;

	public Contact(String name, String surname, String phoneNumber,
			String address, String birthdate, String likes, String dislikes,
			String wantsOnBirthday, String education, String canHelpWith) {
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.birthdate = birthdate;
		this.likes = likes;
		this.dislikes = dislikes;
		this.wantsOnBirthday = wantsOnBirthday;
		this.education = education;
		this.canHelpWith = canHelpWith;
	}
	
}//end of class
