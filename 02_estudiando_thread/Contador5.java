package thread;

public class Contador5 extends Thread{
	
	long TIEMPOTOTAL, TIEMPOTOTAL2;
    
    public Contador5(){        
    }

    public void run() {
    	
    	long tInicio = System.nanoTime();
    	long tInicio2 = System.currentTimeMillis();
        
        for(int i=1; i<=10; i=i+1) {
            System.out.println(this.getName() +  " estoy contando en " + i); 
        }
        
        this.TIEMPOTOTAL = System.nanoTime() - tInicio;
        this.TIEMPOTOTAL2 = System.nanoTime() - tInicio2;
    
    }

	public long getTIEMPOTOTAL() {
		return TIEMPOTOTAL;
	}

	public long getTIEMPOTOTAL2() {
		return TIEMPOTOTAL2;
	}
    
    

}
