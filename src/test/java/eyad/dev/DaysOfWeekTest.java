package eyad.dev;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DaysOfWeekTest {
    private DaysOfWeek dayWeek;

    @BeforeEach
    public void setUp() {
        dayWeek = new DaysOfWeek();
        dayWeek.createWeekDays();
    }
    @Test
    public void testDayInList() {
        assertTrue(dayWeek.dayInList("Friday"), "Friday should exist in the list.");
        

    }

    @Test
    void testDayRemove() {
        dayWeek.dayRemove("Sunday");
        assertEquals(6, dayWeek.daysLength(), "should have 6 days after removing sunday.");

    }

    @Test
    void testDaySelect() {

    }

    @Test
    void testDaysEmpty() {

    }

    @Test
    public void testDaysLength() {
        assertEquals(7, dayWeek.daysLength(), "should return 7");

    }

    @Test
    public void testDaysOrden() {
        dayWeek.daysOrden();
        List<String> ordenofdays = dayWeek.daysReturn();
        assertEquals("Friday", ordenofdays.get(0), "Friday is the first day.");
        assertEquals("Monday", ordenofdays.get(1), "Monday is the 2 day.");
        assertEquals("Saturday", ordenofdays.get(2), "Saturday is the 3 day.");
        assertEquals("Sunday", ordenofdays.get(3), "Sunday is the 4 day.");
        assertEquals("Thursday", ordenofdays.get(4), "Thursday is the 5 day.");
        assertEquals("Tuesday", ordenofdays.get(5), "Tuesday is the 6 day.");
        assertEquals("Wednesday", ordenofdays.get(6), "Wednesday is the 7 day.");



    }

    @Test
    public void testDaysReturn() {
        assertEquals(7, dayWeek.daysLength(), "list should have 7 days");

    }
}
