import java.util.Scanner;

public class faktorial {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int total = 1;
        int temp = total;
        System.out.print("Bilangan : ");

        int bilangan = myobj.nextInt();
        for (int i = 0; i < bilangan; i++) {
            total *= i + 1;
            System.out.println(temp + " x " + (i + 1) + " = " + total);
            temp = total;
        }
    }
}