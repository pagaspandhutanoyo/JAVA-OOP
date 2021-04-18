// import java.io.BufferedReader;
import java.util.Scanner;

public class DeterminanDemo{
    public static void main(String[] args) {
        Determinan abc = new Determinan();
        // String jwb="Y";
        // Scanner key=new Scanner(System.in);
        // InputStreamReader r=new InputStreamReader(System.in);
        // BufferedReader br=new BufferedReader(r);
        // Determinan abc = new Determinan();
        // do{
        //     System.out.println("nilai a");
        //     abc.a=key.nextFloat();
        //     System.out.println("nilai b");
        //     abc.b=key.nextFloat();
        //     System.out.println("nilai c");
        //     abc.c=key.nextFloat();
        //     abc.cetakDeterminan();
        //     System.out.println("jawab [Y/T]");
        //     jwb=br.readLine();
            
        // }while (jwb.equalsIgnoreCase("Y"));
       
        abc.inputABC();
        abc.hitungX1X2();
        abc.cetakDeterminan();
    }
}