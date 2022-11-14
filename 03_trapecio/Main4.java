package trapecio;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

//import com.panayotis.gnuplot.JavaPlot;

public class Main4 {
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub		
		//String f = "(x^2+1)/2";		
		
		/**/
		double a = 5;
		double b = 20;
		double h = b-a;
		double a2;
		/**/
		int TRAPECIOS = 10000;
		/**/
		ArrayList<Trapecio> t = new ArrayList<Trapecio>();
		/**/
		double ATOTAL=0, APARCIAL=0;
		double delta = (h/TRAPECIOS);
		long inicio, tiempo, ttotal = 0;
		/**/
		String archivoTrapecios = "trapecios.txt";
		PrintWriter oS = new PrintWriter(archivoTrapecios);
		/**/
		for(int i=1; i<=TRAPECIOS; i++) {
			//System.out.println("--------------------");
			//System.out.println("a : " + a);
			a2 = a;
			a = a+(delta);
			b = a;
			//System.out.println("b : " + b);
			/**/
			inicio = System.nanoTime();
			t.add(new Trapecio(funcion(a2), funcion(b), a2, b));			
			tiempo = System.nanoTime() - inicio;
			/**/
			APARCIAL = t.get(i-1).getAREA();		
			//System.out.println("Area Trapecio ("+i+") : " + APARCIAL);
			/**/
			//System.out.println("Tiempo : " + tiempo);
			oS.println( String.valueOf(tiempo) );
			/**/
			ttotal += tiempo; 
			ATOTAL += APARCIAL;
			/**/
		}
		oS.close();
		//System.out.println("--------------------");
		//System.out.println("AREA TOTAL ("+TRAPECIOS+") trapecios : " + ATOTAL);
		//System.out.println("Tiempo total : " + ttotal);
		/**/
		//JavaPlot p = new JavaPlot();
		//p.addPlot("\"/home/richart/eclipse-workspace2019/CDP2022B/trapecios.txt\" with lines");
		//p.plot();	
		/**/
	}
	
	public static double funcion(double x) {		
		return (x*x+1)/2;		
	}

}
