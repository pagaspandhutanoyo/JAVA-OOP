import java.util.Scanner;
public class LuasDanKelilingPersegi {
  public static void main(String[] args) {
    int sisi;
    double keliling, luas;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan panjang sisi persegi: ");
    sisi = scan.nextInt();
    luas = sisi * sisi;
    keliling = 4 * sisi;
    System.out.println("Luas Persegi adalah " + luas);
    System.out.println("Keliling Persegi adalah " + keliling);
  }
}