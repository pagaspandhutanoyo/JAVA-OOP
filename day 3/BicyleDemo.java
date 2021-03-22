public class BicyleDemo {
    public static void main(String[] args) {
        // membuat object
        Bicyle bike = new Bicyle();
        // memanggil atribut dan memberi nilai
        bike.speed=10;
        bike.gear=2;
        
        // memanggil method dan menunjukan nilai parameter
        bike.speedUp(10);
        bike.changeGear(2);

    }
}
