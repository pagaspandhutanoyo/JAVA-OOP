public class Suhu { 
    float c;
    Suhu()   //konstruktor -->overloading
    {}
    Suhu(float c)
    {
        this.c=c;
    }
    void setC(float c)
    {
        this.c=c;
    }
    float getC()
    {
        return c; 
    }
    float cToK()
    {
        return c+273.15f;
    } 
    float cToF()
    {
        return c+1.8f+32; 
    }
    float cToRa()
    {
        return c+1.8f+491.67f; 
    }
    float cToDe()
    {
        return (100-c)*1.5f; 
    }
    float cToN() 
    {
        return c + 0.33f;
    }
    
    float cToRe() 
    {
        return c * 0.8f;
    }
    
    float cToRo()
    {
        return c * 0.525f+7.5f;
    }

}

