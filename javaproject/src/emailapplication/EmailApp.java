package emailapplication;

public class EmailApp {

	public static void main(String[] args) {
		
		//creating object from email.java and set constructor
		Email em1 = new Email("Nikhil", "Kamath"); 
		//whatever we are writing code in email.java file that all happening
		//because of above given constructor
		
//		em1.setAlternateEmail("js@mail.com");
//		System.out.println(em1.getAlternateEmail());
		System.out.println(em1.showInfo());
		
		

	}

}
