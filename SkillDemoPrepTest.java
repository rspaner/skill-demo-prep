import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoPrepTest {
    @Test
    public void subtraction() {
        int difference = SkillDemoPrep.subtract(3,4);
        assertEquals(-1, difference);
    } 
}
