public class SecondsAndMinutes {
    public static void getDurationString(int minutes, int seconds){
        if (minutes >=0 && seconds >= 0 && seconds <= 59){
            int hours = minutes / 60;
            System.out.println(hours +"h " + (minutes % 60) +"m "
            + seconds +"s");
        } else {
            System.out.println("Invalid Value");
        }
    }
    public static void getDurationString(int seconds){
        if (seconds >=0){
            int minutes = seconds / 60;
            int secondsMod = seconds % 60;
            getDurationString(minutes, secondsMod);
        } else {
            System.out.println("Invalid value");
        }
    }
}
