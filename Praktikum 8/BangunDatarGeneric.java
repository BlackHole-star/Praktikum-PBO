/*
Nama File 	: BangunDatarGeneric.java
Pembuat		: Angga Syaputra - 24060121140137
Deskripsi 	: kelas konstruksi generic untuk BangunDatar 
*/

public class BangunDatarGeneric<F extends BangunDatar>{
	private F bangunDatar;
	
	public void set(F tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public F get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}

// JIka Mengubah karakter 'T' menjadi 'T2' atau karakter lain di dalam kelas BangunDatarGeneric, kode tersebut akan tetap berjalan tanpa masalah. 
//Karakter yang digunakan hanya sebagai nama variabel saja
