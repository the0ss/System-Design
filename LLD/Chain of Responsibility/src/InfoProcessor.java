public class InfoProcessor extends LogProcessor{

    InfoProcessor(LogProcessor newLogProcessor) {
        super(newLogProcessor);
    }
    public void log(int logLvl,String message){
        if(logLvl==INFO)
            System.out.println("INFO: "+message);
        else{
            super.log(logLvl, message);
        }
    }
    
}
