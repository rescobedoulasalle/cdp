package trapecio;

public class Trapecio2 extends Thread {
	
	double base;
	double BASE;
	double aX;
	double bX;
	/**/
	double h;
	/**/
	double AREA;
	long tiempo;
	
	public Trapecio2(double para1, double para2, double para3, double para4) {
		this.base = para1;
		this.BASE = para2;
		this.aX = para3;
		this.bX = para4;
		//this.h = this.bX - this.aX;
		//this.AREA = ((this.base+this.BASE)*this.h)/2;
	}
	
	
	public void run() {
		long inicio = System.nanoTime();
		this.h = this.bX - this.aX;
		this.AREA = ((this.base+this.BASE)*this.h)/2;
		this.tiempo = System.nanoTime() - inicio;
	}
	
	/*
	public void calcular() {
		this.h = this.bX - this.aX;
		this.AREA = ((this.base+this.BASE)*this.h)/2;
	}*/
	
	public double getAREA() {
		return AREA;
	}

	public long getTiempo() {
		return tiempo;
	}
	
	
	
}
