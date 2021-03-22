import static java.lang.Math.sqrt;
import java.util.Scanner;
public class LuasDanKelilingSegitiga {
    public static void main(String[] args) {
        int alas,tinggi;
        double sisimiring, keliling,luas;
                
        Scanner segitiga = new Scanner(System.in);
        System.out.print("Masukkan Alas: ");
        alas = segitiga.nextInt();
        System.out.print("Masukkan Tinggi: ");
        tinggi = segitiga.nextInt();
        System.out.println("");
        
        //menghitung luas
        luas = 0.5*alas*tinggi;
        System.out.println("Luasnya adalah: "+luas);
        //menghitung sisi miring
        sisimiring = sqrt((alas*alas)+(tinggi*tinggi)); 
        //menghitung keliling
        keliling = alas+tinggi+sisimiring;
        System.out.println("Kelilingnya adalah: "+keliling);         
    }
}