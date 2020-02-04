import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class LeapYearShould {
    @Test
    public void say_is_not_leap_year_when_is_not_divisible_by_4() {
        boolean result = LeapYear.check(4);

        assertFalse(result);
    }
}
