public class Contador{

    String nombre;
    int inicio;
    int fin;
    int paso;

    // inicio:5, final:20, paso 4
    // 5 - 9 - 13 - 17 

    public Contador(String para0, int para1, int para2, int para3){
        this.nombre = para0;
        this.inicio = para1;
        this.fin = para2;
        this.paso = para3;
    }

    public void corazon() {
        
        for(int i=this.inicio; i<=this.fin; i=i+this.paso) {
            System.out.println(this.nombre +  " estoy contando en " + i); 
        }
    
    }

}
