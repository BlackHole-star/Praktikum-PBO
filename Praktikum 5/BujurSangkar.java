/*
Nama File 	: BujurSangkar.java
Pembuat		: Angga Syaputra - 24060121140137
Deskripsi 	: kelas yang membuat implementasi metode abstrak pada bangun datar
*/

public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){
        double luas = sisi * sisi;
        return luas;
    }
    //Ketika BujurSangkar tidak diimplementasikan maka akan terjadi error saat compile karena file BujurSangkar
    //karena BangunDatar merupakan abstrak yang di dalamanya terdapat metode yang harus diimplementasikan ke BujurSangkar
        
    //jika implementeasi metode dari abstrak tidak dibuat maka akan terjadi errpr
    //dimana file bujursangkat tidak dapat dikompile dan tidak dianggap sebagai inherit abstract dari bangun datar
}
