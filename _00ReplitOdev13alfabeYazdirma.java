package _00Replit;

import java.util.Scanner;

public class _00ReplitOdev13alfabeYazdirma {

		public static void main(String[] args) {
			
	 Scanner scan=new Scanner (System.in);
	 System.out.print("Lütfen bir sayi giriniz : ");
	 int sayi=scan.nextInt();
	 
	 int toplam=0;
	 
	 for (int i = 1; i < sayi; i++) {
		if (sayi%i==0) {
			
			toplam+=i;
		}
	}if (toplam==sayi) {
	 System.out.println(sayi+ " sayisi mükemmel bir sayidir.");
	}else {
		System.out.println(sayi+ " sayisi mükemmel bir sayi degildir.");
	}
			
		scan.close();			
			
	}
}
		
		 
