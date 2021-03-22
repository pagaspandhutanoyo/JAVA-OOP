public class TesMobil {
    public static void main(String[] args) {
        Mobil avanza=new Mobil();
        Mobil xenia=new Mobil(); 
        avanza.maju();
        avanza.mundur();
        avanza.belok();
        System.out.println("roda avanza  :" +avanza.roda);
        System.out.println("roda Xenia  :" +xenia.roda);
        System.out.println("mesin avanza : " +avanza.mesin);
        System.out.println("mesin Xenia : " +xenia.mesin);
        
    }
}
