/*
Nama File 	: OperasiTitik.java
Pembuat		: Angga Syaputra - 24060121140137
Tanggal		: Rabu, 1 Maret 2022
Deskripsi 	: Berupa file operasi titik
*/

class OperasiTitik{
	//public void refleksiSumbuX(Titik titik){
		//Double ordinat = titik.getOrdinat();
		//titik.setOrdinat(-1 * ordinat);
	//}

	//public void refleksiSumbuY(Titik titik){
		//Double absis = titik.getAbsis();
		//titik.setAbsis(-1 * absis);
	//}

	private void refleksiSumbuX(Titik t1){
        	t1.setAbsis(t1.getAbsis());
        	t1.setOrdinat(-1*(t1.getOrdinat()));
	}

    private void refleksiSumbuY(Titik t1){
        t1.setAbsis(-1*(t1.getAbsis()));
        t1.setOrdinat(t1.getOrdinat());
    }

    // Public method
    public Titik refleksiX(Titik t1){
        refleksiSumbuX(t1);
        return t1;
    }

    public Titik refleksiY(Titik t1){
       	refleksiSumbuY(t1);
       	return t1;
    }
}

