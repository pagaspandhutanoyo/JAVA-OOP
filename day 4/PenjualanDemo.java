import java.util.Scanner;
public class PenjualanDemo{
    public static void main(String[] args){
        boolean running = true;
        int counter = 0;
        Penjualan databarang = new Penjualan();
        while (running){
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Kode Barang : ");
            String kode = input.nextLine();
            System.out.print("Masukkan Nama Barang : ");
            String nama = input.nextLine();
            System.out.print("Masukkan Harga Barang : ");
            float harga = input.nextFloat();
            System.out.print("Masukkan Jumlah Barang : ");
            int jumlah = input.nextInt();
            databarang.setData(kode, nama, harga, jumlah);
            System.out.print("Input Data Lagi[Y/T] ? ");
            String jawab = input.next();
            if (jawab.equalsIgnoreCase("T")){
                databarang.getTotalPembelian();
                databarang.getBonus();
                databarang.cetakNota();
                break;
            }
            counter ++;
        }
    }
}
