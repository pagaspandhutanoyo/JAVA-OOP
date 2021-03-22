import java.util.Scanner;

public class LuasDanKelilingKubus {
    public static void main(String[] arg) {

        int sisi;
        double keliling, luas;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus : ");
        sisi = scan.nextInt();
        luas = 6 * (sisi * sisi);
        keliling = 12 * sisi ;
        System.out.println("Luas kubus adalah " + luas);
        System.out.println("Keliling kubus adalah " + keliling);
    }
    
}
