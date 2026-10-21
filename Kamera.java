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
    
    public String getLand()
    {
        if(marke.contains(" "))
        {
            int pos;
            pos = marke.indexOf(" ");
            return marke.substring(0, pos);
        }
        
        else
        {
            System.out.println("Kein Land angegeben");
            return null;
        }
        
    }
    
    public String getMarkenName()
    {
        if(marke.contains(" "))
        {
            int pos;
            pos = marke.indexOf(" ");
            return marke.substring(pos+1);
        }
        
        else
        {
            System.out.println("Unvollständige Angabe");
            return null;
        }
    }
}