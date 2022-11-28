import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample02 {
    public static void main(String args[]){

        Runnable task01 = new Runnable() {
            public void run() {
                System.out.println("Hello world");
            }
        };
                
        ExecutorService exeServ = Executors.newSingleThreadExecutor();
        exeServ.execute(task01);
        exeServ.shutdownNow();

    }
}
