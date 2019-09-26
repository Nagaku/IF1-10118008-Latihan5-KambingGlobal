/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 *
 *  @author
 * NAMA			: Michael Nagaku Milenn Salim
 * KELAS		: IF1
 * NIM			: 10118008
 * Deskripsi Program	: Program ini berisi program untuk menampilkan biodata rockstar
 */
public class Latihan5 {
	int jumlahKambing = 88;
	public void getJumlahKambing(){
		System.out.println("Jumlah Kambing " + jumlahKambing);
	}
	public void tambahKambing(){
		jumlahKambing = jumlahKambing + 5;
		System.out.println("Jumlah kambing setelah ditambah : " + jumlahKambing);
	}
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Latihan5 kambingSusu = new Latihan5();
		kambingSusu.getJumlahKambing();
		kambingSusu.tambahKambing();
		kambingSusu.getJumlahKambing();
		// TODO code application logic here
	}
	
}
