package pekan5;

public class PerulanganBelahKetupat {
	public static void main(String[] args) {
        int n = 4; 
        int lebarMaks = 16; 
        System.out.println("#================#");

        for (int i = 0; i < n; i++) {
            System.out.print("|");

        for (int j = 0; j < n - i - 1; j++) {
             System.out.print("  "); }
             System.out.print("<>");
            
        for (int j = 0; j < i; j++) {
             System.out.print("...."); }
             System.out.print("<>");

        int panjangBaris = (n - i - 1) * 2 + 4 + (i * 4);

        while (panjangBaris < lebarMaks) {
             System.out.print(" ");
             panjangBaris++; }
             System.out.println("|"); }

        for (int i = n - 2; i >= 0; i--) {
             System.out.print("|");
            
        for (int j = 0; j < n - i - 1; j++) {
             System.out.print("  "); }
             System.out.print("<>");
            
        for (int j = 0; j < i; j++) {
             System.out.print("...."); }
             System.out.print("<>");
            
        int panjangBaris = (n - i - 1) * 2 + 4 + (i * 4);
           
        while (panjangBaris < lebarMaks) {
             System.out.print(" ");
             panjangBaris++; }
             System.out.println("|"); }
             System.out.println("#================#");
    }
}

