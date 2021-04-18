public class Nilai{
    char nHuruf;
    String nim,nama,predikat;
    float nilaiTugas,nilaiUts,nilaiUas,nilaiPTugas,nilaiPUts,nilaiPUas,nilaiAkhir;
    void setData (String nim, String nama, float nilaiTugas, float nilaiUts, float nilaiUas){
    this.nim=nim;
    this.nama=nama;
    this.nilaiTugas=nilaiTugas;
    this.nilaiUts=nilaiUts;
    this.nilaiUas=nilaiUas;
    }
    char getNilHuruf(float nilai)
    {
    if(nilai>=85)
        nHuruf='A';
    else if(nilai>=70 && nilai<85)
        nHuruf='B';
    else if(nilai>=60 && nilai<70)
        nHuruf='C';
    else if(nilai>=40 && nilai<60)
        nHuruf='D';
    else nHuruf='E';
    return nHuruf;  
    }
    String getPredikat(char huruf){
    switch(huruf){
        case 'A':predikat="Apik";
        break;
        case 'B':predikat="Baik";
        break;
        case 'C':predikat="Cukup";
        break;
        case 'D':predikat="Dablek";
        break;
        default:predikat="Elek";
    }
    return predikat;
    }

    void hitungNilai(){
        nilaiPTugas=0.2f*nilaiTugas;
        nilaiPUts=0.35f*nilaiUts;
        nilaiPUas=0.45f*nilaiUas;
        nilaiAkhir=nilaiPTugas+nilaiPUts+nilaiPUas;
    }
    void cetak(){
        System.out.println("Nim \t: "+nim);
        System.out.println("Nama \t: "+nama);
        System.out.println("Tugas \t: "+nilaiTugas+" 20% : "+nilaiPTugas);
        System.out.println("UTS \t: "+nilaiUts+" 35% : "+nilaiPUts);
        System.out.println("UAS \t: "+nilaiUas+" 45% : "+nilaiPUas);
        System.out.println("Nilai Akhir : "+nilaiAkhir);
        System.out.println("Nilai Huruf : "+getNilHuruf(nilaiAkhir));
        System.out.println("Predikat : "+getPredikat(nHuruf));
    }
}