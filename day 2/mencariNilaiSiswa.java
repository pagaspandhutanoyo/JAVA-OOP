class Orang {
    String nim;
    String nama;
    float N_uts;
    float N_tugas;
    float N_uas;
    float N_uts1; 
    float N_tugas1; 
    float N_uas1; 
    float nilaiAkhir;

    void hitungNilai(int N_tugas, int N_uts, int N_uas) {
        this.N_tugas = N_tugas;
        this.N_uts = N_uts;
        this.N_uas = N_uas;
        this.N_tugas1 = N_tugas * (0.20f);
        this.N_uts1 = N_uts * (0.35f);
        this.N_uas1 = N_uas * (0.45f);
        this.nilaiAkhir = (N_tugas1) + (N_uts1) + (N_uas1);
    }

    void cetak(String input1, String input2) {
        nama = input1;
        nim = input2;
        System.out.println("Nim : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Tugas : " + N_tugas + " 20% : " + N_tugas1);
        System.out.println("Nilai Uts : " + N_uts + " 35% : " + N_uts1);
        System.out.println("Nilai Uas : " + N_uas + " 45% : " + N_uas1);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }
}

public class mencariNilaiSiswa {
    public static void main(String args[]) {
        Orang Ghiyatsi = new Orang();
        Ghiyatsi.hitungNilai(80, 90, 87);
        Ghiyatsi.cetak("Ghiyatsi", "08982983");
    }
}
