class Mobil {  S
    tring warna;
    int tahunProduksi;
}
public class MobilDemo {
    public static void main(String[] args){
    // Membuat object
    Mobil mobilku = new Mobil();
    //memanggil atribut dan memberi nilai
    mobilku.warna = "Hitam";
    mobilku.tahunProduksi = 2006;
    System.out.println("Warna: " + mobilku.warna);
    System.out.println("Tahun: " + mobilku.tahunProduksi);
    
    }
}