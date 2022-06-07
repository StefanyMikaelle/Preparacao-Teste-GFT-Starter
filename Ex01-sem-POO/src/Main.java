import java.util.Locale;
import java.util.Scanner;

import calculos.Triangulo;

public class Main {

	public static void main(String[] args) {
		
		
		Triangulo x, y ;
		
		x = new Triangulo ();
		y = new Triangulo ();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com as medidas do triângulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as medidas do triângulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triângulo X area: %.4f%n", areaX );
		System.out.printf("Triângulo Y area: %.4f%n", areaY);
		
		sc.close();
		
		if (areaX > areaY) {
			System.out.println("Maior área do Triângulo:  X " );
		}else {System.out.println("Maior área do Triângulo:  Y " );}
	}

}
