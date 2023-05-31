package com.tutorial;

import java.util.*;

public class Kalkulator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inputUser;
		inputUser = new Scanner(System.in);
		float a,b,hasil;
		String operator;
		
		System.out.print("a = ");
		a = inputUser.nextFloat();
		System.out.print("operator = ");
		operator = inputUser.next();
		System.out.print("b = ");
		b = inputUser.nextFloat();
		
		switch(operator) {
		case "+":
			hasil = a + b;
			System.out.println(" hasil = " + hasil);
			break;
		case "-":
			hasil = a - b;
			System.out.println(" hasil = " + hasil);
			break;
		case "*":
			hasil = a * b;
			System.out.println(" hasil = " + hasil);
			break;
		case "/":
			hasil = a / b;
			System.out.println(" hasil = " + hasil);
			break;
			
		default:
			System.out.println("operator" + operator + "Tidak Diketahui");
		}
		

	}

}
