public class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor(LogProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }

    public void log(int loglevel, String message) {

        if (loglevel == INFO) {
            System.out.println("INFO: " + message);
        } else {
            super.log(loglevel, message);
        }
    }
}
