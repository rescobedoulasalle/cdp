import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample03 {
    public static void main(String args[]){

        ExecutorService exeServ = Executors.newSingleThreadExecutor();
        exeServ.execute(() ->task01("Richart"));
        exeServ.shutdownNow();

    }

    private static void task01(String name) {
        System.out.println("Hello World"+" "+name);
    }
}
