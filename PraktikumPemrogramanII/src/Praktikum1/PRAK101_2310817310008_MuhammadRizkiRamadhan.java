package Praktikum1;

import java.util.Scanner;

public class PRAK101_2310817310008_MuhammadRizkiRamadhan {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String namaLengkap, tempatLahir;
		String[] bulan = { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "December"};
		int tanggalLahir, bulanLahir, tahunLahir, tinggiBadan;
		double beratBadan;
		
		
		
		System.out.print("Masukkan Nama Lengkap: ");
		namaLengkap = input.nextLine();
		System.out.print("Masukkan Tempat Lahir: ");
		tempatLahir = input.nextLine();
		System.out.print("Masukkan Tanggal Lahir: ");
		tanggalLahir = input.nextInt();
		System.out.print("Masukkan Bulan Lahir: ");
		bulanLahir = input.nextInt();
		System.out.print("Masukkan Tahun Lahir: ");
		tahunLahir = input.nextInt();
		System.out.print("Masukkan Tinggi Badan: ");
		tinggiBadan = input.nextInt();
		System.out.print("Masukkan Berat Badan: ");
		beratBadan = input.nextDouble();
		
		System.out.print("Nama Lengkap "+namaLengkap+", Lahir di "+tempatLahir+" pada Tanggal "+tanggalLahir+" "+bulan[bulanLahir-1]+" "+tahunLahir+" Tinggi Badan "+tinggiBadan+" cm dan Berat Badan " +beratBadan+" kilogram");
		
		input.close();
	}

}
