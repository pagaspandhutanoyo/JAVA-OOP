import java.util.Scanner;  // Import the Scanner class

public class SuhuDemo{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); 
        System.out.print("Enter Celcius : ");

        float c = myObj.nextFloat();
        System.out.println("Celcius is: " + c); 
        Suhu suhuku=new Suhu();
        suhuku.setC(c);
        System.out.println(c+" C   : "  + suhuku.cToK()+" K");
        System.out.println(c+" C   : "  + suhuku.cToF()+" F");
        System.out.println(c+ " C   : " + suhuku.cToRa() + " Ra");
        System.out.println(c + " C   : " + suhuku.cToDe() + " De");
        System.out.println(c + " C   : " + suhuku.cToN() + " N");
        System.out.println(c + " C   : " + suhuku.cToRe() + " Re");
        System.out.println(c + " C   : " + suhuku.cToRo() + " Ro");
    }
}