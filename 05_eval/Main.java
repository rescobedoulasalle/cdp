package eval;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Main {

	public static void main(String[] args) {
		Expression e = new ExpressionBuilder("(x^2+1)/2")
        //.variables("x", "y")
        .variables("x")
        .build()
        .setVariable("x", 2);
        //.setVariable("y", 1);
		double result = e.evaluate();
		
		//Expression e;
		//double result;
		for(double i=5;i<=20;i=i+7.5) {
			e = new ExpressionBuilder("(x^2+1)/2")
	        //.variables("x", "y")
	        .variables("x")
	        .build()
	        .setVariable("x", i);
	        //.setVariable("y", 1);
			result = e.evaluate();
			System.out.println(result);
		}

	}

}
