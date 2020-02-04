import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class LeapYearShould {
    @Test
    @Parameters({
            "1997, false",
            "1999, false"
    })
    public void say_is_not_leap_year_when_1997_is_not_divisible_by_4(int year, boolean isLeapYear) {
        boolean result = LeapYear.check(1997);

        assertFalse(result);
    }


    @Test
    public void say_is_leap_year_when_1996_is_divisible_by_4() {


        assertTrue(LeapYear.check(1996));
    }

    @Test
    public void say_is_leap_year_when_1992_is_divisible_by_4() {


        assertTrue(LeapYear.check(1992));
    }

    @Test
    public void say_is_leap_year_when_1600_is_divisible_by_400() {
        assertTrue(LeapYear.check(1600));
    }

    @Test
    public void say_is_leap_year_when_1800_is_divisible_by_4_by_100_and_not_by_400() {
        assertFalse(LeapYear.check(1800));
    }
}
