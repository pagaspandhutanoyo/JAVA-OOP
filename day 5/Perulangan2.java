import java.io.*;
class Looping2 {
    int bil,pecah;
    void inputBil()throws IOException{
        BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Bilangan : ");
        bil=Integer.parseInt(key.readLine());
        for(int j=1;j<=bil;j++){
            System.out.print(j+ " ");
            if(j%5==0){
                System.out.println("");
            }
        }
        System.out.println("===============");
    }
    void pecah()throws IOException{
        BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("=============== ");
        System.out.print("dipecah : ");
        pecah=Integer.parseInt(key.readLine());
        for(int j=1;j<=bil;j++){
            System.out.print(j+ " ");
            if(j%pecah==0){
                System.out.println("");
            }
        }
    }
}
public class Perulangan2 {
    public static void main(String[] args) throws IOException{
        Looping2 perulangan=new Looping2();
        perulangan.inputBil();
        perulangan.pecah();
    }
}