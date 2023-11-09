import java.util.Scanner;

public class DiziElemanlariToplamiveOrtalamasi {

	

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int dizi [] = {1,2,3,10,18,7,12} ;
		int toplam = 0 ;
		int ortalama ;
	for(int i  = 0 ; i < dizi.length ; i++) {
		toplam+=dizi[i];
		
			
		}
	
	ortalama= toplam/dizi.length;
	
	
	System.out.println("dizinin toplamı = "+toplam );
		System.out.println("dizinin ortlaması = " + ortalama );
		}}	
		
		
	

