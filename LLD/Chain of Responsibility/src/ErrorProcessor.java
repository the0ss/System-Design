public class ErrorProcessor extends LogProcessor{

    ErrorProcessor(LogProcessor newLogProcessor) {
        super(newLogProcessor);
    }

    public void log(int logLvl,String message){
        if(logLvl==ERROR){
            System.out.println("Error: "+message);
        }
        else
            super.log(logLvl, message);
    }
    
}
