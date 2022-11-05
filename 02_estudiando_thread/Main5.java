package thread;

public class Main5 {
    
    public static void main(String args[]){
    
    	long tInicio = System.nanoTime();
    	long tInicio2 = System.currentTimeMillis();
    	
        Contador5 elvis = new Contador5();
        Contador5 yoshiro = new Contador5();
        
        elvis.setName("Elvis");yoshiro.setName("Yoshiro");
                
        elvis.start();
        yoshiro.start();
        
        while(elvis.isAlive() || yoshiro.isAlive()) {
        	//System.out.println("Esperando...");
        }
        long TIEMPOTOTAL = System.nanoTime() - tInicio;
        long TIEMPOTOTAL2 = System.nanoTime() - tInicio2;
        
        System.out.println("TIEMPO TOTAL DE EJECUCION (ns) : "+TIEMPOTOTAL + " ns");
        System.out.println("TIEMPO TOTAL DE EJECUCION (ms) : "+TIEMPOTOTAL2 + " ms");
        System.out.println("---------------------------------------------------------");
        System.out.println("TIEMPO TOTAL DE EJECUCION (ns) : "+elvis.getName() + " " + elvis.getTIEMPOTOTAL() + " ns");
        System.out.println("TIEMPO TOTAL DE EJECUCION (ms) : "+elvis.getName() + " " + elvis.getTIEMPOTOTAL2() + " ms");
        System.out.println("---------------------------------------------------------");
        System.out.println("TIEMPO TOTAL DE EJECUCION (ns) : "+yoshiro.getName() + " " + yoshiro.getTIEMPOTOTAL() + " ns");
        System.out.println("TIEMPO TOTAL DE EJECUCION (ms) : "+yoshiro.getName() + " " + yoshiro.getTIEMPOTOTAL2() + " ms");
        System.out.println("Ejercicio hecho por Richart");

    }
}
