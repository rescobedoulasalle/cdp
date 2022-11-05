package thread;

public class Main4 {
    
    public static void main(String args[]){
    
        Contador4 elvis = new Contador4();
        Contador4 yoshiro = new Contador4();
        
        elvis.setName("Elvis");
        
        System.out.println(elvis.getName() + " : " + elvis.getPriority());
        System.out.println(yoshiro.getName() + " : " + yoshiro.getPriority());
        
        //Thread thread = new Thread();
        
        System.out.println("MIN_PRIORITY : " + Thread.MIN_PRIORITY);
        System.out.println("NORM_PRIORITY : " + Thread.NORM_PRIORITY);
        System.out.println("MAX_PRIORITY : " + Thread.MAX_PRIORITY);
        
        yoshiro.setPriority(10);
        
        System.out.println(elvis.getName() + " : " + elvis.getPriority());
        System.out.println(yoshiro.getName() + " : " + yoshiro.getPriority());
        
        elvis.start();
        yoshiro.start();

    }
}
