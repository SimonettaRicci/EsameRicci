package Test;
import Entity.Rettangolo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestRettangolo {
    @Test
    void testCalculatePerimetroCorrectly(){
        Rettangolo rettangolo = new Rettangolo();
        double result = rettangolo.calculatePerimetro(30.5, 50.67);
        assertEquals(40, result);

    }
}
