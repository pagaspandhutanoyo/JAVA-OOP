import java.util.Scanner;

public class Nilai {
    String nim, nama, predikat;
    float nTgs, nUts, nUas, pUts, pTgs, pUas, nA;
    String nHuruf;
    Scanner in = new Scanner(System.in);

    public Nilai() {
    }

    public Nilai(String nim, String nama, float nTgs, float nUts, float nUas) {
        this.nim = nim;
        this.nama = nama;
        this.nTgs = nTgs;
        this.nUts = nUts;
        this.nUas = nUas;
    }

    public void isiData() {
        for (int w = 1; w <= 2; w++) {
            System.out.println("Nim     :   ");
            nim = in.nextLine();
            System.out.println("Nama    :   ");
            nama = in.nextLine();
            System.out.println("N.Tugas :   ");
            nTgs = in.nextFloat();
            System.out.println("N.Uts   :   ");
            nUts = in.nextFloat();
            System.out.println("N.Uas   :   ");
            nUas = in.nextFloat();

        }

    }

    void hitungNilai() {
        pTgs = .3f * nTgs;
        pUts = .35f * nUts;
        pUas = .35f * nUas;
        nA = pTgs + pUts + pUas;
    }

    String getNilaiHuruf(float nilai) {
        if (nilai > 85)
            nHuruf = "A";
        else if (nilai > 80)
            nHuruf = "AB";
        else if (nilai > 70)
            nHuruf = "B";
        else if (nilai > 65)
            nHuruf = "BC";
        else if (nilai > 60)
            nHuruf = "C";
        else if (nilai > 10)
            nHuruf = "D";
        else
            nHuruf = "E";
        return nHuruf;
    }

    String getPredikat(String huruf) {
        switch (huruf) {
        case "A":
            predikat = "Apik";
            break;
        case "AB":
            predikat = "Apik Baik";
            break;
        case "B":
            predikat = "Baik";
            break;
        case "BC":
            predikat = "Baik Cukup";
            break;
        case "C":
            predikat = "Cukup";
            break;
        case "D":
            predikat = "Dablek";
            break;

        default:
            predikat = "Elek";
        }
        return predikat;
    }

    void cetak() {
        hitungNilai();
        System.out.println("Nim :   " + nim);
        System.out.println("N.Tugas     :   " + nTgs + "    30% :   " + pTgs);
        System.out.println("N.UTS       :   " + nUts + "    35% :   " + pUts);
        System.out.println("N.UAS       :   " + nUas + "    35% :   " + pUas);
        System.out.println("N.Akhir     :   " + nA);
        System.out.println("N.Huruf     :   " + getNilaiHuruf(nA));
        System.out.println("Predikat    :   " + getPredikat(nHuruf));
    }

    void judul() {
        System.out.println("Daftar Nilai PBO");
        System.out.println("----------------");
        System.out.println("Nim     \tNama              \tN.Tgs \tN.Uts \tN.Uas \tN.Akhir" + "\tN.Huruf\tPredikat");
    }

    void daftarNilai() {
        for (int i = 1; i <= 2; i++) {
            System.out.println(nim + "\t" + nama + "\t" + nTgs + "\t" + nUts + "\t" + nUas + "\t" + nA + "\t" + nHuruf
                    + "\t" + predikat);
        }

    }
}
