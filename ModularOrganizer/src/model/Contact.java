//Author: Damian Piela
package model;

import java.io.Serializable;

/**
 * Class for holding data of a single contact-person.
 * @author Damian PIela
 *
 */
public class Contact implements Serializable {
	
	private String name, surname, phoneNumber, address, birthdate,
		likes, dislikes, wantsOnBirthday, education, canHelpWith;

	/**
	 * Constructor for the Contact class. All parameters are of String type.
	 * 
	 * @param name
	 * @param surname
	 * @param phoneNumber
	 * @param address
	 * @param birthdate
	 * @param likes
	 * @param dislikes
	 * @param wantsOnBirthday
	 * @param education
	 * @param canHelpWith
	 */
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

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getLikes() {
		return likes;
	}

	public void setLikes(String likes) {
		this.likes = likes;
	}

	public String getDislikes() {
		return dislikes;
	}

	public void setDislikes(String dislikes) {
		this.dislikes = dislikes;
	}

	public String getWantsOnBirthday() {
		return wantsOnBirthday;
	}

	public void setWantsOnBirthday(String wantsOnBirthday) {
		this.wantsOnBirthday = wantsOnBirthday;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getCanHelpWith() {
		return canHelpWith;
	}

	public void setCanHelpWith(String canHelpWith) {
		this.canHelpWith = canHelpWith;
	}
}//end of class
