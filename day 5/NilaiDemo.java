public class NilaiDemo {
    public static void main(String[] a) {
        Nilai nilaiku = new Nilai("A11.2019.12340", "Pagas Pandhu Tanoyo", 90, 95, 85);
        nilaiku.cetak();
        Nilai nilaimu = new Nilai();
        nilaimu.isiData();
        nilaimu.cetak();
        // cetak ledger, per kolom
        nilaimu.judul();
        nilaimu.daftarNilai();
    }
}
