public class Contador3 extends Thread{

    String nombre;
    //int inicio;
    //int fin;
    //int paso;

    // inicio:5, final:20, paso 4
    // 5 - 9 - 13 - 17 

    public Contador3(String para0){
        this.nombre = para0;
        //this.inicio = para1;
        //this.fin = para2;
        //this.paso = para3;
    }

    public void run() {
        
        for(int i=1; true; i=i+1) {
            System.out.println(this.nombre +  " estoy contando en " + i); 
        }
    
    }

}
