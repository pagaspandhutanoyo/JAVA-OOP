public class MobilDemo2 {
    public static void main(String[] args){
        Mobil2 avanza = new Mobil2();
        avanza.mobil = "Avanza Silver";
        avanza.roda = 4;
        avanza.roda2 = 5;
        avanza.mesin = 1;
        avanza.mesin2 = 9;
        System.out.println("Hiudupkan Mobil : "+avanza.mobil);
        System.out.println("Ubah Gigi Mobil : "+avanza.mobil);
        avanza.maju();
        avanza.mundur();
        avanza.belok();
        System.out.println("Roda Avanza         : "+avanza.roda);
        System.out.println("Roda Xenia          : "+avanza.roda);
        System.out.println("Mesin Avanza        : "+avanza.mesin);
        System.out.println("Mesin Xenia         : "+avanza.mesin);
        System.out.println("Roda Avanza         : "+avanza.roda2);
        System.out.println("Roda Xenia          : "+avanza.roda);
        System.out.println("Mesin Avanza        : "+avanza.mesin2);
        System.out.println("Mesin Xenia         : "+avanza.mesin2);
        System.out.println("Mesin Avanza        : "+avanza.mesin2);
        System.out.println("Mesin Xenia         : "+avanza.mesin2);
        System.out.println("Matikan Mobil       : "+avanza.mobil);
}
}
