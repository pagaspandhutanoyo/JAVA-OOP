// import java.io.*;
import java.util.Scanner;
// import java.io.BufferedReader;
public class Determinan{
    float a, b, c;
    double D, x1, x2;

    void inputABC(){
        boolean running = true;
        int counter = 0;
        while (running) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan nilai a : ");
            float a = input.nextFloat();
            System.out.print("Masukkan nilai b : ");
            float b = input.nextFloat();
            System.out.print("Masukkan nilai c : ");
            float c = input.nextFloat();
            D = (b * b) - 4 * a * c;
            System.out.println("D ((b * b) - 4 * a * c) : " + D);
            System.out.print("Input Data Lagi[Y/T] ? ");
            String jawab = input.next();
            if (jawab.equalsIgnoreCase("T")) {
                // abc.ABC();
                // // abc.hitungD();
                // abc.hitungX1X2();
                // abc.cetakDeterminan();
                break;
            }
        }

    }
    // void hitungD(){
    //     D=b*b-(4*a*c);
    // }
   // void inputABC() throws IOException {
    //     BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    //     System.out.print( "masukan nilai a : ");
    //     a = Integer.parseInt(key.readLine());
    //     System.out.print("masukan nilai b : ");
    //     b = Integer.parseInt(key.readLine());
    //     System.out.print("masukan nilai c : ");
    //     c = Integer.parseInt(key.readLine());
    //     D = (b * b) - 4 * a * c;
    //     System.out.println("D ((b * b) - 4 * a * c) : " + D);
    // }
    // void inputABC(){
        
    // }
    // public class Determinan{
    //     float a,b,c;
    //     double D,x1,x2;
    // void Determinan(){
    //     this.a=a;
    //     this.b=b;
    //     this.c=c;
    // }
    // void hitungD()
    // {
    //     D=b*b-(4*a*c);
    // }
    void hitungX1X2(){
        if(D>0){
        x1=(-b+Math.sqrt(D))/(2*a);
        x2=(-b-Math.sqrt(D))/(2*a);
        }
        else if(D==0){
            x1=x2=-b/(2*a);
        }
        else{
            x1=(-b/(2*a))+(Math.sqrt(D)/(2*a));
            x2=(-b/(2*a))-(Math.sqrt(D)/(2*a));
        }
    } 
    void cetakDeterminan(){
        System.out.println("Nilai a : "+a);
        System.out.println("Nilai b : "+b);
        System.out.println("Nilai c : "+c);
        System.out.println("Nilai D : "+D);
        System.out.println(" Nilai x1 : "+x1);
        System.out.println(" Nilai x2 : "+x2);
    }
}
