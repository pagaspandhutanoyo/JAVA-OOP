import static java.lang.Math.sqrt;
public class KelilingSegitiga{
    public static void main(String[] s){
        int alas= 10;
        int tinggi= 40;
        float sisimiring = sqrt((alas * alas) + (tinggi * tinggi));
        float Keliling= alas + tinggi + sisimiring;
        System.out.println("alas  :"+alas);
        System.out.println("tinggi : "+tinggi);
        System.out.println("keliling segitiga :"+Keliling);

        
    }
}
