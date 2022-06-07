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
		
		System.out.println("Entre com as medidas do tri�ngulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as medidas do tri�ngulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Tri�ngulo X area: %.4f%n", areaX );
		System.out.printf("Tri�ngulo Y area: %.4f%n", areaY);
		
		sc.close();
		
		if (areaX > areaY) {
			System.out.println("Maior �rea do Tri�ngulo:  X " );
		}else {System.out.println("Maior �rea do Tri�ngulo:  Y " );}
	}

}
