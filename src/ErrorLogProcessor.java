public class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(LogProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }

    public void log(int loglevel, String message) {

        if (loglevel == ERROR) {
            System.out.println("ERROR: " + message);
        } else {
            super.log(loglevel, message);
        }
    }
}
