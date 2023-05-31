package com.tutorial;

import java.util.*;

public class Kalkulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inputUser;
		float a, b, hasil;
		char operasi;
		
		inputUser = new Scanner(System.in);
		
		System.out.print("a = ");
		a = inputUser.nextFloat();
		System.out.print("operasi = ");
		operasi = inputUser.next().charAt(0);
		System.out.print("b = ");
		b = inputUser.nextFloat();
		
		System.out.println("input user = " + a + " " + operasi + " " + b);
		
		
		if (operasi == '+'){
			hasil = a + b;
			System.out.println("hasil = " + hasil);
			
		}else if (operasi == '-') {
			hasil = a - b;
			System.out.println("hasil = " + hasil);
			
		}else if (operasi == '*') {
			hasil = a * b;
			System.out.println("hasil = " + hasil);
			
		}else if (operasi == '/') {
			if (b == 0) {
				System.out.println("hasilnya tak hingga");
			}else {
				hasil = a / b;
				System.out.println("hasil = " + hasil);
			}
			
		}else {
			System.out.println("Operasi tidak diketahui");
		}

	}

}
