import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jim", "JM654321J", 32000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Jim", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("JM654321J", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(32000.00, databaseAdmin.getSalary(), 0.0);
    }


    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1000.00);
        assertEquals(33000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canReturn1PercentOfSalary(){
        assertEquals(320.00, databaseAdmin.payBonus(), 0.0);
    }

}
