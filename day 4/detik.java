
public class detik {
    int d, hari, jam, menit, detik;
    void setDetik(int d){
        this.d = d;
    }
    void hitungDetik (){
        hari=d/86400;
        jam=(d % 86400)/3600;
        menit=((d % 86400)%3600)/60;
        detik=(((d % 86400)%3600)%60);
    }
    void cetak(){ 
        hitungDetik();
        System.out.println("Hari \t: " +hari);
        System.out.println("Jam \t: " +jam);
        System.out.println("Menit \t: " +menit);
        System.out.println("Detik \t: " +detik);
    }
}