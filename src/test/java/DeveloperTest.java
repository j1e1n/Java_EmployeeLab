import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Debbie", "DB098765D", 40000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Debbie", developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("DB098765D", developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000.00, developer.getSalary(), 0.0);
    }


    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(5000.00);
        assertEquals(45000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canReturn1PercentOfSalary(){
        assertEquals(400.00, developer.payBonus(), 0.0);
    }

}
