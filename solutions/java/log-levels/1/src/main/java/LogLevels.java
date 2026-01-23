public class LogLevels {
    
    public static String message(String logLine) {
int n=logLine.indexOf(": ");
        String s=logLine.substring(n+2).trim();
        return s;

    }

    public static String logLevel(String logLine) {
        int start=logLine.indexOf("[");
int end=logLine.indexOf("]");
        String s=logLine.substring(start+1,end).trim().toLowerCase();
        return s;
}

    public static String reformat(String logLine) {
        String s1=message(logLine);
        String s2=logLevel(logLine);
        return s1+" ("+s2+")";
    }
}
