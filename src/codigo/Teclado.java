package codigo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {
	
	static Scanner keyboard = new Scanner(System.in);
	
	public static void closekb() {
	
		keyboard.close();
		
	}
	
	
	
	public static char readChar() {
		
		String x="";
		
		do {
		
		x = keyboard.nextLine();
		
		} while (x.equals(""));
		
		char y = x.charAt(0);
	
		return y;
		
		
		
		
	}
	
	
	
	
	public static String readString() {
		
		String x = keyboard.nextLine();
		
		return x;
		
	}
	
	public static boolean readBoolean (String mensaje, String mensaje2, String mensaje3) {
		
		int res=0;
		
		boolean bolres=false;
		
		try {
		
		do {
		
		System.out.printf("%s%n1.%s%n2.%s%n", mensaje, mensaje2, mensaje3);
		
			
		res = keyboard.nextInt();
		
		keyboard.nextLine();
			
		} while (res != 1 && res != 2);
		
		}
		
		catch (InputMismatchException e) {
			
			System.out.println("Error: el tipo de dato introducido no es válido");
			
		}
		
		if (res == 1) {
			
			bolres = true;
			
		}
		
		else if (res == 2) {
			
			bolres = false;
			
		}
		
		else {
			
			System.out.println("Ha ocurrido un error");
			
		}
		
		return bolres;
			
		
		
		
	}
	
	public static boolean readBoolean (String mensaje) {
		
		boolean res=false;
		
		String x;
		
		char y;
		
		do {
		
		do {
		
		System.out.printf("%s (s/n)%n", mensaje);
		
		x = keyboard.nextLine();
		
		} while (x.equals(""));
		
		y = x.charAt(0);
		
		} while ((y != 's' && y != 'S') && (y != 'n' && y != 'N'));
	
		if (y == 's' || y == 'S') {
			
			res = true;
			
		}
		
		else if (y == 'n' || y == 'N') {
			
			res = false;
			
		}
		
		else  {
			
			System.out.println("Ha ocurrido un error");
			
		}
		
		return res;
		
	}
	
	
	
}
