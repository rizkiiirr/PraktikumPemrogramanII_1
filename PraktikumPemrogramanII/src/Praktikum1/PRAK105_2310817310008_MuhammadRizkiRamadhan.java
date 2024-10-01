package Praktikum1;

import java.util.Scanner;

public class PRAK105_2310817310008_MuhammadRizkiRamadhan {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double jariJari, tinggi;
		double pi = 3.14159;
		
		System.out.println("Masukkan jari-jari:");
		jariJari = input.nextDouble();
		System.out.println("Masukkan tinggi:");
		tinggi = input.nextDouble();
		
		double volume = (pi*jariJari*jariJari*tinggi);
		
		System.out.print("Volume tabung dengan jari-jari "+jariJari+" cm dan tinggi "+tinggi+" cm adalah "+volume+" cm3");
		
	}

}
