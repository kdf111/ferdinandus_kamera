

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class KameraTest
{
    /* name = Sony
       megapixel = 0
       blitz = true
       ->Fehler
    */
    @Test
    public void test_megapixel_low()
    {
        Kamera k;
        k = new Kamera("Sony", 0, true);
        assertEquals(20, k.getMegapixel());
    }
    
    /*
     * name = Canon
     * megapixel = 100
     * blitz = true
     */
    @Test
    public void test_megapixel_ok()
    {
        Kamera k;
        k = new Kamera("Canon", 100, true);
        assertEquals(100, k.getMegapixel());
    }
    
    /*
     * name = Canon
     * megapixel = 500
     * blitz = true
     * -> Fehler
     */
    @Test
    public void test_megapixel_high()
    {
        Kamera k;
        k = new Kamera("Canon", 500, true);
        assertEquals(20, k.getMegapixel());
    }
}