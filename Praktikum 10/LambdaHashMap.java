/*
Nama File 	: LambdaHashMap.java
Pembuat		: Angga Syaputra - 24060121140137
Deskripsi 	: Implementasi lambda pada HahsMap, digunakan sebagai parameter pada method
*/

import java.util.HashMap;
import java.util.Map;

public class LambdaHashMap{
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121140137", "Angga Syaputra");
        mahasiswaMap.put("24060121140125", "Raditya Ilham Hastoro");
        mahasiswaMap.put("24060121140095", "Wildan Adji");
        mahasiswaMap.put("24060121130037", "Muhammad Naufal Arkan");
        mahasiswaMap.put("24060121120001", "Muhammad Alif Muckhlis");

        // Menggunakan ekspresi lambda untuk menampilkan key dan value
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
