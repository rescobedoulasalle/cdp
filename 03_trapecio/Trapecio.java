package trapecio;

public class Trapecio {
	
	double base;
	double BASE;
	double aX;
	double bX;
	/**/
	double h;
	/**/
	double AREA;	
	
	public Trapecio(double para1, double para2, double para3, double para4) {
		this.base = para1;
		this.BASE = para2;
		this.aX = para3;
		this.bX = para4;
		this.h = this.bX - this.aX;
		this.AREA = ((this.base+this.BASE)*this.h)/2;
	}
	
	/*
	public void calcular() {
		this.h = this.bX - this.aX;
		this.AREA = ((this.base+this.BASE)*this.h)/2;
	}*/
	
	public double getAREA() {
		return AREA;
	}
	
}
