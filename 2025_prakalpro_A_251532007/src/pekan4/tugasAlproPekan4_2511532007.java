package pekan4;
import java.util.Scanner;
public class tugasAlproPekan4_2511532007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nama Pembeli: ");
        String nama = sc.nextLine();  
        System.out.print("Jumlah Tiket: ");
        int jumlahTiket = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu): ");
        int hari = sc.nextInt();
        System.out.print("Waktu Tayang (1=Pagi, 2=Siang, 3=Malam): ");
        int waktuTayang = sc.nextInt();
        System.out.print("Jenis Studio (1=Regular, 2=Deluxe, 3=Premium): ");
        int jenisStudio = sc.nextInt();
        // Biaya dasar
        int biayaDasar = 50000;
        double biayaHari = 0, biayaWaktu = 0, biayaStudio = 0;
        
        // Biaya tambahan hari 
        if (hari == 2) { // Jumat
            biayaHari = 0.10;
        } else if (hari == 3) { // Sabtu-Minggu
            biayaHari = 0.30;
        }
        
        
        // Biaya tambahan waktu tayang 
        if (waktuTayang == 2) { // Siang
            biayaWaktu = 0.10;
        } else if (waktuTayang == 3) { // Malam
            biayaWaktu = 0.20;
}
        
        // Biaya tambahan jenis studio 
        if (jenisStudio == 2) { // Deluxe
            biayaStudio = 0.20;
        } else if (jenisStudio == 3) { 
            biayaStudio = 0.30;
        }
        
        // Hitung harga per tiket
        double hargaPerTiket = biayaDasar + (biayaDasar * biayaHari) + (biayaDasar * biayaWaktu) + (biayaDasar * biayaStudio);
        
        // Subtotal
        double subtotal = hargaPerTiket * jumlahTiket;
        
        // Diskon
        double diskon = 0;
        if (subtotal > 250000) {
            diskon = subtotal * 0.20;
        }
        double totalBayar = subtotal - diskon;
        
        
        System.out.println("===== PEMBELIAN TIKET BIOSKOP =====");
        System.out.println("Nama Pembeli     : " + nama);
        System.out.println("Jumlah Tiket     : " + jumlahTiket);
        System.out.println("Hari             : " + (hari==1?"Senin-Kamis":hari==2?"Jumat":"Sabtu-Minggu"));
        System.out.println("Waktu Tayang     : " + (waktuTayang==1?"Pagi":waktuTayang==2?"Siang":"Malam"));
        System.out.println("Jenis Studio     : " + (jenisStudio==1?"Regular":jenisStudio==2?"Deluxe":"Premium"));
        System.out.println("------------------------------------");
        System.out.println("Harga Dasar      : Rp " + biayaDasar);
        System.out.println("Biaya Hari       : +" + (int)(biayaHari*100) + "%");
        System.out.println("Biaya Waktu      : +" + (int)(biayaWaktu*100) + "%");
        System.out.println("Biaya Studio     : +" + (int)(biayaStudio*100) + "%");
        System.out.println("Harga per Tiket  : Rp " + (int)hargaPerTiket);
        System.out.println("Subtotal         : Rp " + (int)subtotal);
        System.out.println("Diskon (20%)     : Rp " + (int)diskon);
        System.out.println("------------------------------------");
        System.out.println("TOTAL BAYAR      : Rp " + (int)totalBayar);
        sc.close();
    }  
}