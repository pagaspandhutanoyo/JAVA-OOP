// import java.util.Scanner;
public class Penjualan{
    int total;
    float sharga;
    int sjumlah;
    String snama, skode;
    void setData (String kode, String nama, float harga, int jumlah){
        skode=kode;
        snama=nama;
        sharga=harga;
        sjumlah=jumlah;
        System.out.println("kode \t\t= "+kode);
        System.out.println("nama barang \t= "+nama);
        System.out.println("harga \t\t= "+harga);
        System.out.println("jumlah \t\t= "+jumlah);
    }
    void getTotalPembelian(){ 
        total = (int) (sharga * sjumlah);
        System.out.println("Total Pembelian = "+total);
    }
    void getBonus() {
        if (total >= 500000 && sjumlah > 5)
            System.out.println("Bonus \t\t= Setrika");
        else if ((total >= 100000 && total < 500000) && (sjumlah > 3))
            System.out.println("Bonus \t\t= Payung");
        else if (total >= 50000 && sjumlah > 2)
            System.out.println("Bonus \t\t= Ballpoint");
        else
            System.out.println("Tidak dapat Bonus");
    }
    void cetakNota(){
            System.out.println("=======================================================");
            System.out.println("Kode\tNama\tJumlah\tHarga\t\tTotal");
            System.out.println(skode+"\t"+snama+"\t"+sjumlah+"\t"+sharga+"\t"+total);
    }
}
        
