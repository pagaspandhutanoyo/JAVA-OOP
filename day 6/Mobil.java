package transportasi;
public class Mobil {
    static void maju(){ 
        System.out.println("Maju..."); 
    } 
    void mundur(){ 
        System.out.println("Mundur..."); 
    } 
    void belok(){ 
        System.out.println("Belok..."); 
    } 
    public void cetak(){ 
        Mobil mobilku = new Mobil(); 
        mobilku.maju(); 
        mobilku.mundur(); 
        mobilku.belok(); 
    } 
}
