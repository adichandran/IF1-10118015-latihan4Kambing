/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg101108015.latihan4kambing;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program banyaknya kambing
 */
public class IF1101108015Latihan4kambing {

    private static Object kambingJantan;

    public void tambahKambing(){
        //Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah : "
                + jumlahKambing);
    }
    public static void main(String[] args) {
       IF1101108015Latihan4kambing kambingJantan = new IF1101108015Latihan4kambing();
       kambingJantan.tambahKambing();
    }
    
}
