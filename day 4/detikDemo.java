import java.util.Scanner;
public class detikDemo {
    public static void main(String[] args){
        boolean running = true;
        int counter = 0;
        detik tesdetik= new detik ();
        while (running){
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Detik : ");
            int d = input.nextInt();
            tesdetik.setDetik(d);
            tesdetik.cetak();
            System.out.print("Input Data Lagi [Y/N] ? ");
            String jawab = input.next();
            if (jawab.equalsIgnoreCase("N")){
                break;
            }       
        }
        counter ++;
    }
}
