//Autor: Marcin Czaja

package test;

import static org.junit.Assert.assertEquals;
import model.Contact;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testContact {
	Contact contact;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		System.out.println("Test class: Contact.java");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		System.out.println("End of Test: Contact.java");
	}

	@Before
	public void setUp() throws Exception
	{
		contact = new Contact("Harry", "Potter", "688333111",
				"Hogward", "02.02.1989", "Fruits", "Vegetables",
				"Game", "University education", "Computer crash");
	}

	@After
	public void tearDown() throws Exception
	{
		System.out.println("End test");
		contact = null;
	}

	@Test
	public void testContactFirst()
	{
		System.out.println("testContactFirst()");
		
		assertEquals("Fail: variable name", "Harry", contact.getName());
		assertEquals("Fail: variable surname", "Potter", contact.getSurname());
		assertEquals("Fail: variable phoneNumber", "688333111", contact.getPhoneNumber());
		assertEquals("Fail: variable address", "Hogward", contact.getAddress());
		assertEquals("Fail: variable birthdate", "02.02.1989", contact.getBirthdate());
		assertEquals("Fail: variable likes", "Fruits", contact.getLikes());
		assertEquals("Fail: variable dislikes", "Vegetables", contact.getDislikes());
		assertEquals("Fail: variable wantsOnBirthday", "Game", contact.getWantsOnBirthday());
		assertEquals("Fail: variable education", "University education", contact.getEducation());
		assertEquals("Fail: variable canHelpWith", "Computer crash", contact.getCanHelpWith());
	}
	
	@Test
	public void testContactSecond()
	{	
		System.out.println("testContactSecond()");
		
	    Contact contact2 = new Contact("Harry", "Potter", "688333111",
				"Hogward", "02.02.1989", "Fruits", "Vegetables",
				"Game", "University education", "Computer crash");
	    
	    assertEquals("Fail: variable name", contact2.getName(), contact.getName());
		assertEquals("Fail: variable surname", contact2.getSurname(), contact.getSurname());
		assertEquals("Fail: variable phoneNumber", contact2.getPhoneNumber(), contact.getPhoneNumber());
		assertEquals("Fail: variable address", contact2.getAddress(), contact.getAddress());
		assertEquals("Fail: variable birthdate", contact2.getBirthdate(), contact.getBirthdate());
		assertEquals("Fail: variable likes", contact2.getLikes(), contact.getLikes());
		assertEquals("Fail: variable dislikes", contact2.getDislikes(), contact.getDislikes());
		assertEquals("Fail: variable wantsOnBirthday", contact2.getWantsOnBirthday(), contact.getWantsOnBirthday());
		assertEquals("Fail: variable education", contact2.getEducation(), contact.getEducation());
		assertEquals("Fail: variable canHelpWith", contact2.getCanHelpWith(), contact.getCanHelpWith());
	}
	
	@Test
	public void testContactThird()
	{
		System.out.println("testContactThird()");
		
	    assertEquals("Fail: variable name", contact.getName(), contact.getName());
		assertEquals("Fail: variable surname", contact.getSurname(), contact.getSurname());
		assertEquals("Fail: variable phoneNumber", contact.getPhoneNumber(), contact.getPhoneNumber());
		assertEquals("Fail: variable address", contact.getAddress(), contact.getAddress());
		assertEquals("Fail: variable birthdate", contact.getBirthdate(), contact.getBirthdate());
		assertEquals("Fail: variable likes", contact.getLikes(), contact.getLikes());
		assertEquals("Fail: variable dislikes", contact.getDislikes(), contact.getDislikes());
		assertEquals("Fail: variable wantsOnBirthday", contact.getWantsOnBirthday(), contact.getWantsOnBirthday());
		assertEquals("Fail: variable education", contact.getEducation(), contact.getEducation());
		assertEquals("Fail: variable canHelpWith", contact.getCanHelpWith(), contact.getCanHelpWith());
	}
	
	@Test
	public void testGetName()
	{
		System.out.println("testGetName()");
		
		String name = contact.getName();
		assertEquals("Fail: variable name", "Harry", name);
	}
	
	@Test
	public void testSetNameFirst()
	{
		System.out.println("testSetNameFirst()");
		
		String name="Hermiona";
		contact.setName("Hermiona");
		assertEquals("Fail: variable name", name, contact.getName());
	}
	
	@Test
	public void testSetNameSecond()
	{
		System.out.println("testSetNameSecond()");
		
		assertEquals("Fail: variable name", "Harry", contact.getName());
		contact.setName("Hermiona");
		assertEquals("Fail: variable name", "Hermiona", contact.getName());
	}
	
	@Test
	public void testGetSurname()
	{
		System.out.println("testGetSurname()");
		
		String surname = contact.getSurname();
		assertEquals("Fail: variable surname", "Potter", surname);
	}
	
	@Test
	public void testSetSurnameFirst()
	{
		System.out.println("testSetSurnameFirst()");
		
		String surname="Snow";
		contact.setSurname("Snow");
		assertEquals("Fail: variable surname", surname, contact.getSurname());
	}
	
	@Test
	public void testSetSurnameSecond()
	{
		System.out.println("testSetSurnameSecond()");
		
		assertEquals("Fail: variable surname", "Potter", contact.getSurname());
		contact.setSurname("Snow");
		assertEquals("Fail: variable surname", "Snow", contact.getSurname());
	}
	
	@Test
	public void testGetPhoneNumber()
	{
		System.out.println("testGetPhoneNumber()");
		
		String phonenumber = contact.getPhoneNumber();
		assertEquals("Fail: variable phoneNumber", "688333111", phonenumber);
	}
	
	@Test
	public void testSetPhoneNumberFirst()
	{
		System.out.println("testSetPhoneNumberFirst()");
		
		String phoneNumber="123456789";
		contact.setPhoneNumber("123456789");
		assertEquals("Fail: variable phoneNumber", phoneNumber, contact.getPhoneNumber());
	}
	
	@Test
	public void testSetPhoneNumberSecond()
	{
		System.out.println("testSetPhoneNumnberSecond()");
		
		assertEquals("Fail: variable phoneNumber", "688333111", contact.getPhoneNumber());
		contact.setPhoneNumber("123456789");
		assertEquals("Fail: variable phoneNumber", "123456789", contact.getPhoneNumber());
	}
	
	@Test
	public void testGetAddress()
	{
		System.out.println("testGetAddress()");
		
		String address = contact.getAddress();
		assertEquals("Fail: variable address", "Hogward", address);
	}
	
	@Test
	public void testSetAddressFirst()
	{
		System.out.println("testSetAddressFirst()");
		
		String address="Warsaw";
		contact.setAddress("Warsaw");
		assertEquals("Fail: variable address", address, contact.getAddress());
	}
	
	@Test
	public void testSetAddressSecond()
	{
		System.out.println("testSetAddressSecond()");
		
		assertEquals("Fail: variable address", "Hogward", contact.getAddress());
		contact.setAddress("Warsaw");
		assertEquals("Fail: variable address", "Warsaw", contact.getAddress());
	}
	
	@Test
	public void testGetBirthdate()
	{
		System.out.println("testGetBirthdate()");
		
		String birthdate = contact.getBirthdate();
		assertEquals("Fail: variable birthdate", "02.02.1989", birthdate);
	}
	
	@Test
	public void testSetBirthdateFirst()
	{
		System.out.println("testSetBirthdateFirst()");
		
		String birthdate="Warsaw";
		contact.setBirthdate("Warsaw");
		assertEquals("Fail: variable address", birthdate, contact.getBirthdate());
	}
	
	@Test
	public void testSetBirthdateSecond()
	{
		System.out.println("testSetBirthdateSecond()");
		
		assertEquals("Fail: variable address", "02.02.1989", contact.getBirthdate());
		contact.setBirthdate("01.01.1989");
		assertEquals("Fail: variable address", "01.01.1989", contact.getBirthdate());
	}
	
	@Test
	public void testGetLikes()
	{
		System.out.println("testGetLikes()");
		
		String likes = contact.getLikes();
		assertEquals("Fail: variable likes", "Fruits", likes);
	}
	
	@Test
	public void testSetLikesFirst()
	{
		System.out.println("testSetLikesFirst()");
		
		String likes="Egg";
		contact.setLikes("Egg");
		assertEquals("Fail: variable likes", likes, contact.getLikes());
	}
	
	@Test
	public void testSetLikesSecond()
	{
		System.out.println("testSetLikesSecond()");
		
		assertEquals("Fail: variable likes", "Fruits", contact.getLikes());
		contact.setLikes("Egg");
		assertEquals("Fail: variable likes", "Egg", contact.getLikes());
	}
	
	@Test
	public void testGetDislikes()
	{
		System.out.println("testGetDislikes()");
		
		String dislikes = contact.getDislikes();
		assertEquals("Fail: variable dislikes", "Vegetables", dislikes);
	}
	
	@Test
	public void testSetDislikesFirst()
	{
		System.out.println("testSetLikesDislikes()");
		
		String dislikes="Egg";
		contact.setDislikes("Egg");
		assertEquals("Fail: variable dislikes", dislikes, contact.getDislikes());
	}
	
	@Test
	public void testSetDislikesSecond()
	{
		System.out.println("testSetLikesSecond()");
		
		assertEquals("Fail: variable dislikes", "Vegetables", contact.getDislikes());
		contact.setDislikes("Egg");
		assertEquals("Fail: variable dislikes", "Egg", contact.getDislikes());
	}
	
	@Test
	public void testGetWantsOnBirthday()
	{
		System.out.println("testGetWantsOnBirthday()");
		
		String wantsOnBirthday = contact.getWantsOnBirthday();
		assertEquals("Fail: variable dislikes", "Game", wantsOnBirthday);
	}
	
	@Test
	public void testSetWantsOnBirthdayFirst()
	{
		System.out.println("testSetWantsOnBirthdayFirst()");
		
		String wantsOnBirthday="Egg";
		contact.setWantsOnBirthday("Egg");
		assertEquals("Fail: variable wantsOnBirthday", wantsOnBirthday, contact.getWantsOnBirthday());
	}
	
	@Test
	public void testSetWantsOnBirthdaySecond()
	{
		System.out.println("testSetWantsOnBirthdaySecond()");
		
		assertEquals("Fail: variable wantsOnBirthday", "Game", contact.getWantsOnBirthday());
		contact.setWantsOnBirthday("Egg");
		assertEquals("Fail: variable wantsOnBirthday", "Egg", contact.getWantsOnBirthday());
	}
	
	@Test
	public void testGetEducation()
	{
		System.out.println("testGetEducation()");
		
		String education = contact.getEducation();
		assertEquals("Fail: variable education", "University education", education);
	}
	
	@Test
	public void testSetEducationFirst()
	{
		System.out.println("testSetEducationFirst()");
		
		String education="Lower education";
		contact.setEducation("Lower education");
		assertEquals("Fail: variable education", education, contact.getEducation());
	}
	
	@Test
	public void testSetEducationSecond()
	{
		System.out.println("testSetEducationSecond()");
		
		assertEquals("Fail: variable education", "University education", contact.getEducation());
		contact.setEducation("Lower education");
		assertEquals("Fail: variable education", "Lower education", contact.getEducation());
	}
	
	@Test
	public void testGetCanHelpWith()
	{
		System.out.println("testGetCanHelpWith()");
		
		String canHelpWith = contact.getCanHelpWith();
		assertEquals("Fail: variable canHelpWith", "Computer crash", canHelpWith);
	}
	
	@Test
	public void testSetCanHelpWithFirst()
	{
		System.out.println("testSetCanHelpWithFirst()");
		
		String canHelpWith="no internet";
		contact.setCanHelpWith("no internet");
		assertEquals("Fail: variable canHelpWith", canHelpWith, contact.getCanHelpWith());
	}
	
	@Test
	public void testSetCanHelpWithSecond()
	{
		System.out.println("testSetCanHelpWithSecond()");
		
		assertEquals("Fail: variable canHelpWith", "Computer crash", contact.getCanHelpWith());
		contact.setCanHelpWith("no internet");
		assertEquals("Fail: variable canHelpWith", "no internet", contact.getCanHelpWith());
	}
}
