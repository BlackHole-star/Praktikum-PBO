/*
Nama File 	: Asersi2.java
Pembuat		: Angga Syaputra - 24060121140137
Deskripsi 	: Program untuk demo asersi, yang akan menolak input
				jari-jari lingkaran yang bernilai nol
*/

//class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari>0):"jari jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran = "
			+kelilingLingkaran);
	}
	 /*Pertanyaan 
      secara konsep, ada yang kurang tepat pada program Asersi2 di atas? 
     *Jawab
      Terdapat kode yang kurang tepat pada class Asersi2 yaitu jariJari>0 seharusnya diganti menjadi jariJari!=0.
     */
}