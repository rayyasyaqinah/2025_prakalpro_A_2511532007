package pekan6_2511532007;
import java.util.Random;
import java.util.Scanner;
public class tugasAlproPekan6_2511532007 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int tries= 0;
        boolean menang = false;

        System.out.println("=== Permainan Lempar Dadu ===");

        while (true) {
            tries++;
            int dadu1 = rand.nextInt(6) + 1; 
            int dadu2 = rand.nextInt(6) + 1; 
            int hasil = dadu1 + dadu2;

            System.out.print(dadu1 + " + " + dadu2 + " = ");
            int jawaban = scanner.nextInt(); 

            if (hasil == 7 && jawaban == 7) {
                System.out.println("Tebakan Anda Benar");
                System.out.println("Anda menang setelah " + tries + " percobaan!");
                menang = true;
                
                break;
                
            } else {
                System.out.println("Tebakan Anda Salah");
                System.out.print("Apakah mau lempar dadu (Ya / Tidak)? ");
                String jawab = scanner.next();
                if (jawab.equalsIgnoreCase("tidak")) {
                    break;
                }
            }
        }

        if (!menang) {
            System.out.println("Anda gagal menang");
        }

        scanner.close();
    }
	}


