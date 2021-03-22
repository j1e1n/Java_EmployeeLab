import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Gillian", "GL192837G", 50000.00, "Sales", 200000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Gillian", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("GL192837G", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000.00, director.getSalary(), 0.0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Sales", director.getDeptName());
    }


    @Test
    public void canRaiseSalary(){
        director.raiseSalary(2000.00);
        assertEquals(52000.00, director.getSalary(), 0.0);
    }

    @Test
    public void canReturn1PercentOfSalary(){
        assertEquals(500.00, director.payBonus(), 0.0);
    }


}
