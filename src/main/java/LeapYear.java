public class LeapYear {
    public static boolean check(int year) {
        if(year % 100 == 0 && !isDivisibleBy400(year)){
            return false;
        }

        if(isDivisibleBy400(year)){
            return true;
        }

        return isDivisibleBy4(year);
    }

    private static boolean isDivisibleBy4(int year) {
        return year % 4 == 0;
    }

    private static boolean isDivisibleBy400(int year) {
        return year % 400 == 0;
    }
}
