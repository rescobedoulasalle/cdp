package trapecio;

import java.util.ArrayList;

public class Main2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//String f = "(x^2+1)/2";		
		
		/**/
		double a = 5;
		double b = 20;
		double h = b-a;
		double a2;
		/**/
		int TRAPECIOS = 100;
		/**/
		ArrayList<Trapecio> t = new ArrayList<Trapecio>();
		/**/
		double ATOTAL=0, APARCIAL=0;
		double delta = (h/TRAPECIOS);
		long inicio, tiempo, ttotal = 0;
		/**/
		for(int i=1; i<=TRAPECIOS; i++) {
			System.out.println("--------------------");
			System.out.println("a : " + a);
			a2 = a;
			a = a+(delta);
			b = a;
			System.out.println("b : " + b);
			/**/
			inicio = System.nanoTime();
			t.add(new Trapecio(funcion(a2), funcion(b), a2, b));			
			tiempo = System.nanoTime() - inicio;
			/**/
			APARCIAL = t.get(i-1).getAREA();		
			System.out.println("Area Trapecio ("+i+") : " + APARCIAL);
			System.out.println("Tiempo : " + tiempo);
			ttotal += tiempo; 
			ATOTAL += APARCIAL;
			/**/
		}
		System.out.println("--------------------");
		System.out.println("AREA TOTAL ("+TRAPECIOS+") trapecios : " + ATOTAL);
		System.out.println("Tiempo total : " + ttotal);
	}
	
	public static double funcion(double x) {		
		return (x*x+1)/2;		
	}

}
