package fibobacciSerisi;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// fibonacci serisi
		
		int oncekiSayi=0, simdikiSayi=1 , sonrakiSayi=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("fibonacci serisinin eleman sayısını giriniz  ");
		int elemanSayisi = input.nextInt();
		
		for (int i=0 ; i <=elemanSayisi ; i++ ) {
			 
			System.out.print(oncekiSayi + " ");
			
			 sonrakiSayi=oncekiSayi + simdikiSayi;
	            oncekiSayi=simdikiSayi;
	            simdikiSayi=sonrakiSayi;

		}

	}

}
