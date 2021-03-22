import java.util.Scanner;

public class LuasDanKelilingLingkaran {
    public static void main(String[] args) {
        float phi = 3.14f;
        int r;
        double keliling, luas;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan panjang jari-jari Lingkaran: ");
        r = scan.nextInt();
        luas = phi* r * r;
        keliling = 2 * phi * r;
        System.out.println("Luas Lingkaran adalah " + luas);
        System.out.println("Keliling Lingkaran adalah " + keliling);
    }
}