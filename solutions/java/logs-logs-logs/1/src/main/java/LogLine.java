public class LogLine {
String logLine;
    public LogLine(String logLine) {
        this.logLine=logLine;
    }

    public LogLevel getLogLevel() {
        String level =logLine.substring(1,4);
        switch(level){
            case "TRC": return LogLevel.TRACE;
            case "DBG": return LogLevel.DEBUG;
            case "INF": return LogLevel.INFO;
            case "WRN": return LogLevel.WARNING;
            case "ERR": return LogLevel.ERROR;
             case "FTL": return LogLevel.FATAL;
        }
        return LogLevel.UNKNOWN;
    }

    public String getOutputForShortLog() {
        int inf=logLine.indexOf(":");
        String message=logLine.substring(inf+2);
     return getLogLevel().getCode()+":"+message;
    }
}
