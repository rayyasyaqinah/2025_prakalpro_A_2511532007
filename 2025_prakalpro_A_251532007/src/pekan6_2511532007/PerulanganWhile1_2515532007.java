package pekan6_2511532007;
import java.util.Scanner;
public class PerulanganWhile1_2515532007 {
	public static void main(String[] args) {
		int counter=0;
		String jawab;
		boolean running = true;
		//deklarasi scanner
		Scanner scan = new Scanner(System.in);
		while (running) {
			counter++;
			System.out.println("Jumlah = "+counter);
			System.out.print("Apakah lanjut (ya/tidak?)");
			jawab= scan.nextLine();
			//cek jawab = tidak, perulangan berheti
			if (jawab.equalsIgnoreCase("tidak")) {
				running = false;
			}
	
		}
		
		System.out.println("Anda sudaah melakukan perulangan sebanyak "+counter+" kali");
	}
	//2511532007
}
