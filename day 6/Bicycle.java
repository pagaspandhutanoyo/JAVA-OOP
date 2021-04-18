package transportasi;
public class Bicycle {
    int speed = 0; 
    int gear = 0; 
    void changeGear(int newValue) { 
        gear = gear + newValue; 
        System.out.println("Gear:" + gear); 
    } 
    void speedUp(int increment) { 
        speed = speed + increment; 
        System.out.println("Speed:" + speed); 
    }
    public void cetak2(){ // Membuat object 
        Bicycle bike = new Bicycle(); //memanggil atribut dan memberi nilai 
        bike.speed=10; 
        bike.gear=2; // Memanggil method dan menunjuk nilai parameter 
        bike.speedUp(10); 
        bike.changeGear(2); }
}
