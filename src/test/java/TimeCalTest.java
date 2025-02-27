import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeCalTest {

    @Test
    public void testCalculateTime() {
        assertEquals(3600, TimeCal.calculateTime(1, 0, 0));
        assertEquals(3661, TimeCal.calculateTime(1, 1, 1));
        assertEquals(0, TimeCal.calculateTime(0, 0, 0));
        assertEquals(60, TimeCal.calculateTime(0, 1, 0));
        assertEquals(1, TimeCal.calculateTime(0, 0, 1));
    }
}