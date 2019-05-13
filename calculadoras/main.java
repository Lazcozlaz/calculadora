package calculadoras;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean salir = false;
		double num1 ;
		double num2;
		while(!salir) {
		System.out.println("1 - Suma.");
		System.out.println("2 - Resta.");
		System.out.println("3 - Multiplicación.");
		System.out.println("4 - División.");
		System.out.println("0-Salir");
	
			Scanner sc = new Scanner(System.in);
			int op = sc.nextInt();
			
			switch (op) {
			case 1:
				System.out.println("Ingrese los numeros para la suma: ");
				 num1 =sc.nextDouble();
				 num2 = sc.nextDouble();
				Suma sum = new Suma(num1,num2);
				System.out.println(sum.suma());
				break;
			case 2:
				System.out.println("Ingrese los numeros para la resta: ");
				 num1 =sc.nextDouble();
				 num2 = sc.nextDouble();
				Resta res= new Resta(num1,num2);
				System.out.println(res.resta());
				break;
			case 3:
				System.out.println("Ingrese los numeros para la multiplicación: ");
				 num1 =sc.nextDouble();
				 num2 = sc.nextDouble();
				Multiplicacion mul= new Multiplicacion(num1,num2);
				System.out.println(mul.multiplicacion());
				break;
			case 4:
				System.out.println("Ingrese los numeros para la División: ");
				 num1 =sc.nextDouble();
				 num2 = sc.nextDouble();
				Division div= new Division(num1,num2);
				System.out.println(div.division());
				break;
			case 0:
				salir = true;
				break;
			}
			}
	
	}

}
