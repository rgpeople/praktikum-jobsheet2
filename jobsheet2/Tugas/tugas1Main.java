
package jobsheet2.Tugas;

import java.util.Scanner;

public class tugas1Main {
    
    public static void main(String[] args) {
        tugas1 Barang1 = new tugas1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama Barang : ");
        Barang1.nama = sc.nextLine();
        System.out.print("Masukkan harga satuan Barang : ");
        Barang1.hargaSatuan = sc.nextInt();
        System.out.print("Masukkan jumlah Barang : ");
        Barang1.jumlah = sc.nextInt();
        System.out.println("======================================");
        int totalHarga = Barang1.hitungHargaTotal(Barang1.hargaSatuan, Barang1.jumlah);
        System.out.println("Total : " +totalHarga);
        double dis = Barang1.hitungDiskon();
        System.out.println("Diskon :  "+dis);
        double bayar = Barang1.hitungHargaBayar();
        System.out.println("Total Bayar : "+bayar);
    }
}
