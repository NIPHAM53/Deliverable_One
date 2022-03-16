import java.util.Scanner;

public class CreatePassword {

	public static void main(String[] args) {
		
		System.out.println("Create a password that is 7-12 characters long. With at least one lowercase letter, one uppercase letter, and an excalmation point(!) ");
		
		try (Scanner scnr = new Scanner(System.in)) {
			boolean valid = false;
				
			while (!valid) {
				System.out.println("Password:");
				String Password = scnr.nextLine();
				
				if(Password.contains("!") && Password.length() >= 7 && Password.length() <= 12 && Password.matches(".*[A-Z].*") && Password.matches(".*[a-z].*") ) {
				valid = true;	
				System.out.println("Password valid and accepted");	
				
				}else {
					System.out.println("Error try again");
					
				}
					
				
						
					
				}
		}
			}
		 
		}
	


