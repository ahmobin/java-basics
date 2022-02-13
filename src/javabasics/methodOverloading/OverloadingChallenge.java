package javabasics.methodOverloading;

public class OverloadingChallenge {
    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 && (seconds < 0 || seconds > 59))
            return "invalid value";

        int hours = minutes / 60;
        minutes = minutes % 60;
        return hours + "h " + minutes +"m " + seconds + "s";
    }

    public static String getDurationString(int seconds){
        if(seconds < 0 )
            return "invalid value";

        int minutes = seconds / 60;
        seconds = seconds % 60;
        return getDurationString(minutes, seconds);
    }
}
