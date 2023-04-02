/*
Nama File 	: AngkaSialException.java
Pembuat		: Angga Syaputra - 24060121140137
Deskripsi 	: Eksepsi buatan sendiri, menolak masukan angka 13!
*/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial !!!");
	}
}