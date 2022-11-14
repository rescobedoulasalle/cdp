package trapecio;

import java.util.ArrayList;

public class Main3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//String f = "(x^2+1)/2";		
		
		/**/
		double a = 5;
		double b = 20;
		double h = b-a;
		double a2;
		/**/
		int TRAPECIOS = 99;
		/**/
		ArrayList<Trapecio2> t = new ArrayList<Trapecio2>();
		/**/
		double ATOTAL=0, APARCIAL=0;
		double delta = (h/TRAPECIOS);
		
		/**/
		for(int i=1; i<=TRAPECIOS; i++) {
			System.out.println("--------------------");
			System.out.println("a : " + a);
			a2 = a;
			a = a+(delta);
			b = a;
			System.out.println("b : " + b);
			/**/
			t.add(new Trapecio2(funcion(a2), funcion(b), a2, b));
			/**/
			t.get(i-1).start();
			/**/
		}
		
		boolean vivos = true;
		while(vivos) {
			int cant_vivos = 0;
			for(int j=0; j<t.size(); j++) {
				if(t.get(j).isAlive()) {
					cant_vivos = cant_vivos + 1;
				}
			}
			if(cant_vivos==0) {
				break;
			}
		}
		
		
		for(int j=0; j<t.size(); j++) {
			APARCIAL = t.get(j).getAREA();		
			System.out.println("Area Trapecio ("+(j+1)+") : " + APARCIAL);
			System.out.println("Tiempo : " + t.get(j).getTiempo());
			ATOTAL += APARCIAL;
		}
		System.out.println("--------------------");
		System.out.println("AREA TOTAL ("+TRAPECIOS+") trapecios : " + ATOTAL);
	}
	
	public static double funcion(double x) {		
		return (x*x+1)/2;		
	}

}
