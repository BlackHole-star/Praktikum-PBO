/*
Nama File 	: Lingkaran.java
Pembuat		: Angga Syaputra - 24060121140137
Deskripsi 	: Kelas implementasi IArea berupa cara menghitung luas lingkaran
*/

//mengambil konstanta yang ada di kelas java.lang.Math
import static java.lang.Math.PI;

class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r) {
        jejari = r;
    }

    public double hitungLuas() {
        return PI * jejari * jejari;
    }
}