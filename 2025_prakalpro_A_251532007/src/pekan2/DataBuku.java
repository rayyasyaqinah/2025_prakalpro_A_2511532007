package pekan2;

public class DataBuku {

		public static void main(String[] args) {
		    int stokBuku = 10;           // jumlah stok buku
	        float hargaBuku = 75000f;    // harga buku
	        char kategori = 'F';         // kategori buku F untuk Fiksi
	        boolean tersedia;            // status ketersediaan buku
	        
	        // Tentukan ketersediaan berdasarkan stok
	        if (stokBuku > 0) { 
	            tersedia = true; }
	        else {
	            tersedia = false; }
	        
	        System.out.println("=== Informasi Buku di Toko ===");
	        System.out.println("Stok Buku      : " + stokBuku);
	        System.out.println("Harga Buku     : Rp " + hargaBuku);
	        System.out.println("Kategori Buku  : " + kategori);
	        System.out.println("Tersedia       : " + (tersedia ? "Ya" : "Tidak"));
	        
	    }
	}
