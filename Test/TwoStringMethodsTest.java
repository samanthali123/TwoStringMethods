import org.junit.Test;

import static org.junit.Assert.*;

public class TwoStringMethodsTest {

    @Test
    public void alternateStrings1() {
        String result = TwoStringMethods.alternateStrings("abc", "xyz");
        assertEquals("axbycz", result);
    }

    @Test
    public void alternateStrings2() {
        String result = TwoStringMethods.alternateStrings("Hi", "There");
        assertEquals("HTihere", result);
    }
    @Test
    public void alternateStrings3() {
        String result = TwoStringMethods.alternateStrings("xxxx", "Thereee");
        assertEquals("xTxhxexreee", result);
    }
    
    @Test
    public void alternateStrings4() {
        String result = TwoStringMethods.alternateStrings("Thereee", "xxxx");
        assertEquals("Txhxexrxeee", result);
    }

    @Test
    public void abcTest1() {
        boolean result = TwoStringMethods.abcTest("123abc");
        assertEquals(true, result);
    }

    @Test
    public void abcTest2() {
        boolean result = TwoStringMethods.abcTest("123.abc");
        assertEquals(false, result);
    }

    @Test
    public void abcTest3() {
        boolean result = TwoStringMethods.abcTest("abc.123");
        assertEquals(true, result);
    }
}