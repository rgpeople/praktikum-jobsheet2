# Laporan 2
## Faiz Atha Radhitya
1F 2141720229 


# Jobsheet 2
Objek

# 2.2 Deklarasi Class, atribut, dan Method
```java
package jobsheet2.percobaan;

public class barang{
    String namaBarang, jenisBarang;
    int stok, hargaSatuan;

    barang(){
    }

    barang(String nm, String jn, int st, int hs){
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }

    void tampilBarang(){
        System.out.println("Nama = "+namaBarang);
        System.out.println("Jenis = "+jenisBarang);
        System.out.println("Stok = "+stok);
        System.out.println("Harga Satuan = "+hargaSatuan);
    }

    void tambahStok(int n){
        stok = stok + n;
    }

    void kurangiStok(int n){
        stok = stok - n;
    }

    int hitungHargaTotal(int jumlah){
        return jumlah*hargaSatuan;
    }
}
```
# 2.2.3 Pernyataan
1. Sebutkan 2 karakteristik class/objek! 

      Object : Memiliki sesuatu (Atribut), Bisa melakukan suatu tingkat (Method)

     Class : Memiliki Atribut dan Method (Rancangan)

2. Kata kunci apakah yang digunakan untuk mendeklarasikan class?

      class //deklarasi nama class

3. Perhatikan class Barang yang ada di Praktikum di atas, ada berapa atribut yang dimiliki oleh class 
tersebut? Sebutkan! Dan pada baris berapa saja deklarasi atribut dilakukan?
    
    ada, 4 atribut, (namaBarang, jenisBarang, stok, hargaSatuan)


4. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja 
deklarasi method dilakukan?

    ada, 4 method (tampilBarang, tambahStok, kurangiStok, hitungHargaTotal). 

5. Perhatikan method kurangiStok() yang ada di class Barang, modifikasi isi method tersebut 
sehingga proses pengurangan hanya dilakukan jika stok masih ada (masih lebih besar dari 0) 

6. Menurut Anda, mengapa method tambahStok() dibuat dengan memiliki 1 parameter berupa 
bilangan int?

    untuk menghitung tambahan stok
7. Menurut Anda, mengapa method hitungHargaTotal() memiliki tipe data int?

    untuk me-return jumlah * hargaSatuan (hargaTotal) dan digunakan untuk int
8. Menurut Anda, mengapa method tambahStok() memiliki tipe data void?

    karena tidak menggunakan return nilai / value

# 2.3 Instansiasi Objek dan Mengakses Atribut & Method
```java
package jobsheet2.percobaan;

public class barangMain{
    public static void main(String[] args) {
        barang b1 = new barang();
        b1.namaBarang = "Corsair 2 GB";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 250000;
        b1.stok = 10;
        b1.tambahStok(1);
        b1.kurangiStok(5);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = "+hargaTotal);
        barang b2 = new barang("Logitech", "Wireless Mouse", 25, 150000);
        b2.tampilBarang();
    }
}
```
<img src = percobaan1.png>

# 2.3.3 Pertanyaan
1. Pada class BarangMain, pada baris berapakah proses instansiasi dilakukan? Dan apa nama objek 
yang dihasilkan?

    "Barang b1"

2. Bagaimana cara mengakses atribut dan method dari suatu objek?

    Atribut

    namaObjek.namaAtribut = nilai;  (b1.stok = 10;)

    Method

    namaObjek.namaMethod(); (b1.tampilBarang();

# 2.4 Membuat Konstruktor

<image src = konstruktor.png>

# 2.5 Latihan Praktikum

## No 1
tugas1
```java
package jobsheet2.Tugas;

public class tugas1 {
    String nama;
    int hargaSatuan, jumlah;

    tugas1(){
    }

    int hitungHargaTotal(int hrgSt, int jmlh){
        hargaSatuan = hrgSt;
        jumlah = jmlh;
        return hrgSt * jmlh;
    }

    int hitungDiskon(){
        int hrgT = hitungHargaTotal(hargaSatuan, jumlah);
        double d = 0;
        int diskon;
        if (hrgT > 100000){
            d = hrgT * 0.1;
            diskon = (int) d;
            return diskon;
        }else if(hrgT <= 100000 && hrgT >= 50000){
            d = hrgT * 0.5;
            diskon = (int) d;
            return diskon;
        } else return 0 ;
    }

    int hitungHargaBayar(){
        int htgT = hitungHargaTotal(hargaSatuan, jumlah) - hitungDiskon();
        return htgT;
    }
}
```
tugas1Main
```java
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
```
hasil

<image src = hasiltugas1.png >

## No 2
tugas2
```java
package jobsheet2.Tugas;

public class tugas2 {
    int x, y, width, height; 
    tugas2(int x1, int y1, int w, int h){
        x = x1;
        y = y1;
        width = w;
        height = h;
    }

    void moveLeft(){
        if(x > 1) x--;
        printPosition();
    }

    void moveRight(){
        if(x < width) x++;
        printPosition();
    }

    void moveUp(){
        if(y < height) y++;
        printPosition();
    }

    void moveDown(){
        if(y > 1) y--;
        printPosition();
    }

    void printPosition(){
        System.out.println("Posisi (" + x + ","+y+")");
    }
}
```
tugas2Main
```java
package jobsheet2.Tugas;

import java.util.Scanner;

public class tugas2Main {
    public static void main(String[] args) {
        tugas2 p = new tugas2(10, 10, 20, 20);
        Scanner sc = new Scanner(System.in);
        
        p.printPosition();
        System.out.println("ENTER YOUR COMMAND");
        System.out.println("===================");
        System.out.println("a => Move left");
        System.out.println("d => Move right");
        System.out.println("w => Move up");
        System.out.println("a => Move down");
        System.out.println("x => Exit");
       
        loop :while (true) {
            switch(sc.nextLine()){
                case "a":
                    p.moveLeft();
                    break;
                case "d":
                    p.moveRight();
                    break;
                case "w":
                    p.moveUp();
                    break;
                case "s" :
                    p.moveDown();
                    break;
                case "x":
                System.out.println("Out from the script");
                    break loop;
                default :
                    p.printPosition();
                    break;
                
            }
        }
    }
}
```
hasil

<image src = hasiltugas2.png>