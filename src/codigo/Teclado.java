package codigo;

import java.util.Scanner;

public class Teclado {
	
	static Scanner keyboard = new Scanner(System.in);
	
	public static void closekb() {
	
		keyboard.close();
		
	}
	
	public static char readChar() {
		
		char x = keyboard.next().charAt(0);
		
		keyboard.nextLine();
		
		return x;
		
	}
	
}
