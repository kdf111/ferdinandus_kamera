public class Kamera
{
    private String  marke;
    private int     megapixel;
    private boolean blitz;
        
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
        megapixel = neuMegapixel;
    }
    
    public void setBlitz(boolean neuBlitz)
    {
        blitz = neuBlitz;
    }
}