/*
Nama File 	: MKubus.java
Pembuat		: Angga Syaputra - 24060121140137
Deskripsi 	: driver class untuk poligon, bujur sangkar, dan kubus
*/

package org.main;

import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus{
	public static void main(String[] args){
		// Bujur Sangkar panjang sisi 4 satuan
		BujurSangkar bujurSangkar = new BujurSangkar(4);
		Kubus kubus = new Kubus(bujurSangkar);
		
		// Bujur Sangkar panjang sisi 15 satuang
		BujurSangkar bujurSangkar2 = new BujurSangkar(15);
		Kubus kubus2 = new Kubus(bujurSangkar2);
		
		System.out.println("Luas Alas Kubus : " + kubus.hitungLuasAlas());
		System.out.println("Volume Kubus : " + kubus.hitungVolume());
		
		System.out.println("");
		
		System.out.println("Luas Alas Kubus : " + kubus2.hitungLuasAlas());
		System.out.println("Volume Kubus : " + kubus2.hitungVolume());
	}
}