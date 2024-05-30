package OopWithNLayeredApp.core.logging;

public class DatabaseLogger implements Logger{
    public void log(String data){
        System.out.println("Veritabanina loglandi : " + data);
    }
    
}
