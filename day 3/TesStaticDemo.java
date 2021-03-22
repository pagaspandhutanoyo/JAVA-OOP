public class TesStaticDemo {
    public static void main(String[] args) {
        //satu(); --> error statci call non static
        TesStatic tes = new TesStatic();
        tes.satu();
        System.out.println("=======================");
        TesStatic1 coba = new TesStatic1();
        coba.satu1();             
    }
}
