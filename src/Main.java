//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //chain
        LogProcessor logObj=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logObj.log(LogProcessor.ERROR,"exception happens");
        logObj.log(LogProcessor.DEBUG,"need to debug this");
        logObj.log(LogProcessor.INFO,"just for info");

        }
    }
