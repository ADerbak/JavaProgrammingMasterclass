public class BarkingDog {
    public static boolean shouldWakeUp(boolean currentlyBarking, int hourOfDay) {
        if ((currentlyBarking) && ((hourOfDay >= 0 && hourOfDay < 8)
                || (hourOfDay > 22 && hourOfDay <= 23))) {
            return true;
        } else {
            return false;
        }
    }
}
