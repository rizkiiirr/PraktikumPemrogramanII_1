package Praktikum1;

import java.util.Scanner;

public class PRAK102_2310817310008_MuhammadRizkiRamadhan {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int bilanganAwal, banyakAngka = 1;
		System.out.print("Masukkan:");
		bilanganAwal = input.nextInt();
		
		while (banyakAngka < 11) {
			  if (bilanganAwal % 5 == 0) {
				  System.out.print((bilanganAwal/5-1)+ " ");
			  }
			  else {
					  System.out.print(bilanganAwal+ " ");
				  }
		  bilanganAwal++;
		  banyakAngka++;
		  }
		}
	}
