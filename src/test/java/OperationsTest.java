import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OperationsTest {

    private Operations operations = new Operations();

    @Test
    public void anioBisiestoTrueTest(){
        boolean result = operations.anioBisiesto(2016);
        assertTrue(result);
    }

    @Test
    public void anioBisiestoFalseTest(){
        boolean result = operations.anioBisiesto(2021);
        assertFalse(result);
    }

    @Test
    public void diasPorMesWithAnioBisiestoTest(){
        int result = operations.diasPorMes(2,2016);
        assertEquals(29,result);
    }

    @Test
    public void diasPorMesWithoutAnioBisiestoTest(){
        int result = operations.diasPorMes(2,2021);
        assertEquals(28,result);
    }

    @Test
    public void diasPorMesWith31daysTest(){
        int result = operations.diasPorMes(12,2021);
        assertEquals(31,result);
    }

    @Test
    public void diasPorMesWith30daysTest(){
        int result = operations.diasPorMes(4,2021);
        assertEquals(30,result);
    }
}
