import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeapYearCheckerShould {

    @Test
    public void is_not_a_leap_year_if_not_divisible_by_4() {
        String result = LeapYearChecker.check(4);

        assertEquals("Is Leap Year", result);
    }
}
