class PersegiEmpat
{ 
    float p,l;
    PersegiEmpat()
    { }
    PersegiEmpat(float p,float l)
    {
        this.p=p;
        this.l=l;
    }
    void setP(float p)
    {
        this.p=p;
    }
    float getP()
    {
        return p;
    }
        void setL(float l)
    {
        this.l=l;
    }
        float getL()
    {
        return l;
    }
        float getLuas()
    {
        return (p*l);
    }
    void cetak()
    {
        System.out.println("Panjang : "+getP());
        System.out.println("Lebar : "+getL());
        System.out.println("Luas : "+getP()+" x "+getL()+" = "+getLuas());
    }
}
public class PersegiDemo
{
    public static void main(String a[])
    {
    PersegiEmpat persegiku=new PersegiEmpat();
    PersegiEmpat persegimu=new PersegiEmpat();
    PersegiEmpat persegipacarku=new PersegiEmpat(100,101);
    persegiku.setP(10);
    persegiku.setL(15);
    persegiku.cetak();  
    persegimu.p=12;
    persegimu.l=13;
    persegimu.cetak();
    persegipacarku.cetak();
    }
}