import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample01 {
    public static void main(String args[]){
        
        ExecutorService exeServ = Executors.newSingleThreadExecutor();
        exeServ.execute(() -> System.out.println("Hello World" + " : " + Thread.currentThread().getName()));
        exeServ.shutdownNow();

    }
}
