/*
Nama File 	: Pegawai.java
Pembuat		: Angga Syaputra - 24060121140137
Deskripsi 	: Program untuk demo Polimorfisme Inclusion
*/

public class Pegawai {
	protected String nama;
	protected int gajiPokok = 5000000;

	public void setNama (String name){
		nama = name;
	}
	
	public void tampilData(){
		System.out.println("Nama : "+nama+", Gaji pokok : "+gajiPokok);
	}
}