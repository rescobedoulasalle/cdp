package trapecio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//String f = "(x^2+1)/2";		
		double a = 5;
		double b = 20;
		double base = funcion(a);
		double BASE = funcion(b);
		//double h = b-a;		
		Trapecio t = new Trapecio(base, BASE, a, b);		
		//t.calcular();		
		System.out.println("1 trapecio : " + t.getAREA());	
		
	}
	
	public static double funcion(double x) {		
		return (x*x+1)/2;		
	}
	
	

}
