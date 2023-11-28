public abstract class LogProcessor {
    public static int INFO=1;
    public static int DEBUG =2;
    public static int ERROR=3;

    LogProcessor nexLogProcessor;
    LogProcessor(LogProcessor newLogProcessor){
        this.nexLogProcessor=newLogProcessor;
    }

    public void log(int logLvl,String message){
        if (this!=null) {
            nexLogProcessor.log(logLvl,message);
        }
    }
}
