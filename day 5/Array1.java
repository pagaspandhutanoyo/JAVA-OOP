public class Array1 {
    public static void main(String[] args) {
        int[] x; // Cara 1
        x = new int[5];
        x[0] = 68;
        x[1] = 7;
        x[2] = 28;
        x[3] = 90;
        x[4] = 32;

        System.out.println("Jumplah Data : " + x.length);
        for (int i = 1; i < x.length; i++) {
            System.out.println("Data ke     - " + i + "    :   " + x[i]);
        }

        System.out.println("");

        for (int i = 0; i < x.length; i++) {
            System.out.println("Hasil nilai  [" + i + "]   :   " + x[i]);
        }

    }
}