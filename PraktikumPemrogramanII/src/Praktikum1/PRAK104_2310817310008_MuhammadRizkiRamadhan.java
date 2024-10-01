package Praktikum1;

import java.util.Scanner;

public class PRAK104_2310817310008_MuhammadRizkiRamadhan {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String tanganAbu, tanganBagas;
		int skorAbu = 0, skorBagas = 0;
		
		System.out.print("Tangan Abu:");
		tanganAbu = input.nextLine();
		System.out.print("Tangan Bagas:");
		
		tanganBagas = input.nextLine();
		
		for (int i = 0; i < 3; i++) {
			char abu = tanganAbu.charAt(i), bagas = tanganBagas.charAt(i);
			
			
			if (abu == bagas) {
				continue;
			}
			else if ((abu == 'B') && (bagas == 'G') || (abu == 'G') && (bagas == 'K') || (abu == 'K') && (bagas == 'B')) {
			skorAbu++;
			}
			else {
			skorBagas++;
			}
		}
		
		if (skorAbu > skorBagas) {
			System.out.print("Abu");
		}
		else if (skorAbu < skorBagas) {
			System.out.print("Bagas");
		}
		else {
			System.out.print("Seri");
		}
		
		input.close();
	}
}