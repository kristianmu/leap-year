import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LeapYearShould {
    @Test
    public void not_be_a_leap_year_when_is_not_divisible_by_4() {

        assertFalse(LeapYear.check(1997));
    }

    @Test
    public void be_a_leap_year_when_is_divisible_by_4() {

        assertTrue(LeapYear.check(1996));
    }
}