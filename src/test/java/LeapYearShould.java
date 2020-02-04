import org.junit.Test;

public class LeapYearShould {
    @Test
    public void not_be_a_leap_year_when_is_not_divisible_by_4() {

        assertFalse(LeapYear.check(1997));
    }
}