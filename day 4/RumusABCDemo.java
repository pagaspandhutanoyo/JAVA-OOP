import java.io.*;
public class RumusABCDemo {
    public static void main(String[] args) throws IOException {
        boolean running = true;
        int counter = 0;
        RumusABC abc=new RumusABC();
        while (running){  
            Scanner input = new Scanner(System.in);
            System.out.print("Masukan Nilai a : ");
            float a = input.nextInt();
            System.out.print("Masukan Nilai b : ");
            float b = input.nextInt();
            System.out.print("Masukan Nilai c: ");
            float c = input.nextInt();
            D = (b * b) - 4 * a * c;
            System.out.println("D((b*b)-4*a*c) : " + D);
            System.out.print("Input Data Lagi[Y/T] ? ");
            String jawab = input.next();
                if (jawab.equalsIgnoreCase("T")) {
                    abcnilaiX();
                    abc.cetak();;
                    break;
                }
            counter++;
        
        }
    //     abc.inputABC();
    //     abcnilaiX();
    //     abc.cetak();
    }
}