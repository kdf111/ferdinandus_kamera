public class Kamera
{
    private String  marke;
    private int     megapixel;
    private boolean blitz;
    
    public Kamera (String neuMarke, int neuMegapixel, boolean neuBlitz)
    {
        setMarke(neuMarke);
        setMegapixel(neuMegapixel);
        setBlitz(neuBlitz);
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
    
    public void setMarke(String neuMarke)
    {
        marke = neuMarke;
    }
    
    public void setMegapixel(int neuMegapixel)
    {
        if ((neuMegapixel >=1) && (neuMegapixel <=200))
        {
            megapixel = neuMegapixel;
        }
        else
        {
            System.out.println("Megapixel Anzahl nicht gültig");
            megapixel = 20;
        }
    }
    
    public void setBlitz(boolean neuBlitz)
    {
        blitz = neuBlitz;
    }
    
    public void printKamera()
    {
        System.out.println(marke + " Kamera: " + megapixel + " Megapixel - " + blitz);
    }
}