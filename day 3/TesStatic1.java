public class TesStatic1 {
    int a = 10;
    static int b = 20;
    protected int c = 30;
    public int d = 40;
    private int e = 50;

    void satu1() {
        dua1();
        System.out.println("Satu............");
        System.out.println("Satu............a" + a);
        System.out.println("Satu............b" + b);
        System.out.println("Satu............c" + c);
        System.out.println("Satu............d" + d);
        System.out.println("Satu............e" + e);
    }

    static void dua1() {
        System.out.println("dua............b" + b);
    }
}