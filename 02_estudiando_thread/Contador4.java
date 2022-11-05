package thread;

public class Contador4 extends Thread{
    
    public Contador4(){        
    }

    public void run() {
        
        for(int i=1; true; i=i+1) {
            System.out.println(this.getName() +  " estoy contando en " + i); 
        }
    
    }

}
