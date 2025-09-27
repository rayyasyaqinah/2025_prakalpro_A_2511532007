package pekan3;

import java.util.Scanner;

public class TugasPekan3BangunRuang {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("===Menghitung Volume Tabung===");
		System.out.println("Rumus volume tabung: PI * r * r * t");
		System.out.print("Masukkan jari-jari tabung:");
		double r = scanner.nextDouble();
		System.out.print("Masukkan tinggi tabung:");
		double t = scanner.nextDouble();
		double volume = 3.14 * r * r * t;
		
		System.out.print("Volume tabung adalah:" + volume);
		
	}

}
