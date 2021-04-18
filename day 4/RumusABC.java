import java.io.*;
class RumusABC {
    double D,x1,x2;
    int a,b,c;
    void nilaiX(){
        if (D<0){
            x1=(-b/(2*a))+(Math.sqrt(-D))/(2*a);
            x2=(-b/(2*a))-(Math.sqrt(-D))/(2*a);}
        else if(D==0){
            x1=-b/(2*a);x2=-b/(2*a);}
        else{
            x1=-b+Math.sqrt(D)/(2*a);
            x2=-b-Math.sqrt(D)/(2*a);
        }
    }
    void cetak(){
        System.out.println(a+"\t"+b+"\t"+c+"\t"+D+"\t"+x1+"\t"+x2);
    }
}