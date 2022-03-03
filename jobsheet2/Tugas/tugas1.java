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
