/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : Berisi program print nama
 */
public class IF110118005Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=====Aplikasi Pencetak Nama=====");
        Scanner sc = new Scanner(System.in);
        Printer print = new Printer();
        System.out.print("Masukkan Nama Anda : ");
        print.setNama(sc.nextLine());
        System.out.print("Mau Cetak Nama Berapa Kali? : ");
        print.setJmlCetak(sc.nextInt());
        print.cetak(print.getNama());
        print.cetak(print.getJmlCetak(), print.getNama());
        
        
    }
    
}
