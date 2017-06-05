package webservice;

import java.util.Scanner;

import webservice.gen.myCalculation.CALCULATION;
import webservice.gen.myCalculation.MyWebService;

public class MyClient{
	public static void main(String[] args){
		System.out.println("Welche Operation möchten Sie durchführen? (+ - * / )");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		CALCULATION service = new MyWebService().getCALCULATIONPort();

		System.out.println("Gib die erste Zahl ein:");
		String f1 = scanner.nextLine();
		
		System.out.println("Gib die zweite Zahl ein:");
		String f2 = scanner.nextLine();

		if( input.equals("+")) {

			System.out.println("Das Ergebniss lautet: " + service.addition(Float.parseFloat(f1), Float.parseFloat(f2)));
		}
		if( input.equals("-")) {

			System.out.println("Das Ergebniss lautet: " + service.subtraktion(Float.parseFloat(f1), Float.parseFloat(f2)));
		}
		if( input.equals("*")) {

			System.out.println("Das Ergebniss lautet: " + service.multiplikation(Float.parseFloat(f1), Float.parseFloat(f2)));
		}
		if( input.equals("/")) {

			System.out.println("Das Ergebniss lautet: " + service.division(Float.parseFloat(f1), Float.parseFloat(f2)));
		}
	}
}


