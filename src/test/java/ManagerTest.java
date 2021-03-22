import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jane", "JN123456J", 30000.00, "HR");
    }

    @Test
    public void hasName(){
        assertEquals("Jane", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("JN123456J", manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("HR", manager.getDeptName());
    }


    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(500.00);
        assertEquals(30500.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canReturn1PercentOfSalary(){
        assertEquals(300.00, manager.payBonus(), 0.0);
    }

}
