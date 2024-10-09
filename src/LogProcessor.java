public abstract class LogProcessor {

    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;

    //VARIABLE

    LogProcessor nextLoggerProcessor;

    public LogProcessor(LogProcessor nextLoggerProcessor) {
        this.nextLoggerProcessor = nextLoggerProcessor;
    }

    public void log(int loglevel, String message){

        if(nextLoggerProcessor!=null){
            nextLoggerProcessor.log(loglevel,message);
        }
    }
}
