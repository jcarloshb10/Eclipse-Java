package ex2_registerform;

import java.util.Scanner;

public class ConferenceRegister {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("There is a new register?");
			String answer = scan.next();// yes or not
			if(answer.equals("yes")) {
				 new Registerform();
			}else if(answer.contentEquals("no")){
				System.exit(0);
			}
		}
	}

}
