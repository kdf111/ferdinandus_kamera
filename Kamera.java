public class Kamera
{
    private String  marke;
    private int     megapixel;
    private boolean blitz;
    
    public Kamera (String marke, int megapixel, boolean blitz)
    {
        setMarke(marke);
        setMegapixel(megapixel);
        setBlitz(blitz);
    }
        
    public String getMarke()
    {
        return marke;
    }
    
    public int getMegapixel()
    {
        return megapixel;
    }
    
    public boolean getBlitz()
    {
        return blitz;
    }
    
    public void setMarke(String marke)
    {
        this.marke = marke;
    }
    
    public void setMegapixel(int megapixel)
    {
        if ((megapixel >=1) && (megapixel <=200))
        {
            this.megapixel = megapixel;
        }
        else
        {
            System.out.println("Megapixel Anzahl nicht gültig");
            this.megapixel = 20;
        }
    }
    
    public void setBlitz(boolean blitz)
    {
        this.blitz = blitz;
    }
    
    public void printKamera()
    {
        if(blitz == true)
        {
            System.out.println(marke + " Kamera: " + megapixel + " Megapixel - " + "Mit Blitz ausgestattet");
        }
        
        else
        {
            System.out.println(marke + " Kamera: " + megapixel + " Megapixel - " + "Hat keinen Blitz");
        }
    }
}