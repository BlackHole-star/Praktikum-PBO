/*
Nama File 	: MBujurSangkar.java
Pembuat		: Angga Syaputra - 24060121140137
Deskripsi 	: Kelas yang mengimpelemntasikan cara menghitung luas bujur sangkar
*/

import java.util.Scanner;

class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah " +bs.hitungLuas(sisi));
    }
}