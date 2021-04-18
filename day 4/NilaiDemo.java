import java.util.Scanner;
public class NilaiDemo {
    public static void main(String[] args){
    boolean running = true;
    int counter = 0;
    Nilai nilaiku = new Nilai();
    while (running){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        String nim = input.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Nilai Tugas : ");
        float nilaiTugas = input.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        float nilaiUts = input.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        float nilaiUas = input.nextInt();
        nilaiku.setData(nim, nama, nilaiTugas, nilaiUts, nilaiUas);
        System.out.print("Input Data Lagi[Y/T] ? ");
        String jawab = input.next();
            if (jawab.equalsIgnoreCase("T")){
                nilaiku.hitungNilai();
                nilaiku.cetak();
                break;
            }
        counter ++;
        }
    }
}