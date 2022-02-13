package javabasics.methodOverloading;

public class OverloadingChallenge {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 && (seconds < 0 || seconds > 59))
            return INVALID_VALUE_MESSAGE;

        int hours = minutes / 60;
        minutes = minutes % 60;

        String hourString = hours + "h";
        if(hours < 10)
            hourString = "0"+hourString;

        String minuteString = minutes + "m";
        if(minutes < 10)
            minuteString = "0"+minuteString;

        String secondString = seconds + "s";
        if(seconds < 10)
            secondString = "0"+secondString;

        return hourString + " " + minuteString +" " + secondString + " ";
    }

    public static String getDurationString(int seconds){
        if(seconds < 0 )
            return INVALID_VALUE_MESSAGE;

        int minutes = seconds / 60;
        seconds = seconds % 60;
        return getDurationString(minutes, seconds);
    }
}
