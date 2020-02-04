public class LeapYear {
    public static boolean check(int year) {
        if(year % 400 == 0){
            return true;
        }

        if(year % 4 == 0){
            return true;
        }

        return false;
    }
}
