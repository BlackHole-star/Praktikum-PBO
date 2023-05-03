/*
Nama File 	: Manajer.java
Pembuat		: Angga Syaputra - 24060121140137
Deskripsi 	: Program untuk demo Polimorfisme Inclusion
*/

public class Manajer extends Pegawai {
	protected int tunjangan = 700000;
	
	public Manajer (String name){
		nama = name;
	}
	
	public void tampilData() {
		System.out.println("Nama : "+nama+", Gaji pokok : "+gajiPokok);
        System.out.println("Tunjangan : "+tunjangan);
	}
}