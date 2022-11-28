import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample04 {
    public static void main(String args[]){

        ExecutorService exeServ = Executors.newFixedThreadPool(2);
        exeServ.execute(() ->task01("Richart"));
        exeServ.execute(() ->task01("Juan"));
        exeServ.execute(() ->task01("María"));
        exeServ.execute(() ->task01("Carlos"));
        //exeServ.execute(() ->task01("Jose"));
        //exeServ.execute(() ->task01("Teresa"));
        exeServ.shutdown();

    }

    private static void task01(String name) {
        System.out.println(System.nanoTime() + " Start : " + Thread.currentThread().getName());
        System.out.println("Hello World"+" "+name+" with "+Thread.currentThread().getName());
        System.out.println(System.nanoTime() + " Finish : " + Thread.currentThread().getName());
    }
}
