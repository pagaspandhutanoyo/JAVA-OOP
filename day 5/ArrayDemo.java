public class ArrayDemo {
    public static void main(String[] args) {
        int[] x; // Cara 1
        x = new int[3];
        x[0] = 20;
        x[1] = 10;
        x[2] = 30;
        System.out.println("Nilai x[0]  :   " + x[0]);
        System.out.println("Nilai x[1]  :   " + x[1]);
        System.out.println("Nilai x[2]  :   " + x[2]);

        // cetak dengan looping
        System.out.println("-------cetak dengan looping 1--------");
        for (int i = 0; i < x.length; i++) {
            System.out.println("Nilai x[" + i + "]    :   " + x[i]);
        }
        System.out.println("--------Akhir cetak looping 1---------");
        System.out.println("");

        int[] y = new int[3]; // cara 2
        y[0] = 20;
        y[1] = 10;
        y[2] = 30;
        System.out.println("Nilai y[0]  :   " + y[0]);
        System.out.println("Nilai y[1]  :   " + y[1]);
        System.out.println("Nilai y[2]  :   " + y[2]);

        System.out.println("-------cetak dengan looping 2--------");
        for (int i = 0; i < y.length; i++) {
            System.out.println("Nilai x[" + i + "]    :   " + x[i]);
        }
        System.out.println("--------Akhir cetak looping 2---------");
        System.out.println("");

        int[] z = { 20, 10, 30 }; // cara 3 tdk menggunakan new
        System.out.println("Nilai z[0]  :   " + z[0]);
        System.out.println("Nilai z[1]  :   " + z[1]);
        System.out.println("Nilai z[2]  :   " + z[2]);

        System.out.println("-------cetak dengan looping 3--------");
        for (int i = 0; i < z.length; i++) {
            System.out.println("Nilai x[" + i + "]    :   " + z[i]);
        }
        System.out.println("--------Akhir cetak looping 3---------");
        System.out.println("");

    }
}