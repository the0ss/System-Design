public class App {
    public static void main(String[] args) throws Exception {
        LogProcessor log=new InfoProcessor(new ErrorProcessor(null));

        log.log(1, "Exception happens");
    }
}
