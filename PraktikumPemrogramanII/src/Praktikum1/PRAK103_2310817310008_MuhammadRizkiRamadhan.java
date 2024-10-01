package Praktikum1;

import java.util.Scanner;

public class PRAK103_2310817310008_MuhammadRizkiRamadhan {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int bilanganAwal, banyakAngka = 0, N;
		
		System.out.print("Masukkan:");
		N = input.nextInt();
		bilanganAwal = input.nextInt();
		
		
		do {
			if (bilanganAwal % 2 != 0) {
				  System.out.print(bilanganAwal+ " ");
				  banyakAngka++;
			  }
			 bilanganAwal++;
		}
		while (banyakAngka < N);
		
	}
	

}
