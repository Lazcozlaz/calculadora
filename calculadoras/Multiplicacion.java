package calculadoras;

public class Multiplicacion {
	private double num1;
	private double num2;
	public Multiplicacion(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public double multiplicacion(){
		double resultado =this.num1*this.num2;
		return resultado;
	}
}
