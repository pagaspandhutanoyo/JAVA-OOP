public class Matematika {
    int tambah;
    int kurang;
    int kali;
    int bagi;

    void tambah(int angka1, int angka2){
        int hasil=angka1+angka2;
        System.out.println("Pertambahan :"+angka1+"+"+angka2+" = "+hasil);
    }
    void kurang(int angka1, int angka2){
        int hasil=angka1-angka2;
        System.out.println("Pengurangan :"+angka1+"-"+angka2+" = "+hasil);
    }
    void kali(int angka1, int angka2){
        int hasil=angka1*angka2;
        System.out.println("Perkalian :"+angka1+" X "+angka2+" = "+hasil);
    }
    void bagi(int angka1, int angka2){
        int hasil=angka1/angka2;
        System.out.println("Pembagian :"+angka1+" : "+angka2+" = "+hasil);
    }
    void tambah1(int angka1, double angka2) {
        double hasil = angka1 + angka2;
        System.out.println("Pertambahan : " + angka1 + " + " + angka2 + " = " + hasil);
    }

    void kurang1(int angka1, double angka2) {
        double hasil = angka1 - angka2;
        System.out.println("Penngurangan : " + angka1 + " - " + angka2 + " = " + hasil);
    }

    void kali1(int angka1, double angka2) {
        double hasil = angka1 * angka2;
        System.out.println("Perkalian : " + angka1 + " X " + angka2 + " = " + hasil);
    }

    void bagi1(int angka1, double angka2) {
        double hasil = angka1 / angka2;
        System.out.println("Pembagian : " + angka1 + ": " + angka2 + " = " + hasil);
    }

}
