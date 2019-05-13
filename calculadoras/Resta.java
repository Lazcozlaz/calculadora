package calculadoras;

public class Resta {
	private double num1;
	private double num2;
	public Resta(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public double resta(){
		double resultado =this.num1-this.num2;
		return resultado;
	}
}
