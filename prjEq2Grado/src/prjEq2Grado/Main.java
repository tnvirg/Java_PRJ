package prjEq2Grado;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Eq2Grado eq = new Eq2Grado();
		Scanner input = new Scanner(System.in);
		float a = 5;
		float b = 3;
		float c = 2;
		System.out.println("Inserisci A");
		a = input.nextFloat();
		System.out.println("Inserisci B");
		b = input.nextFloat();
		System.out.println("Inserisci C");

		c = input.nextFloat();
		eq.setA(a);
		eq.setB(b);
		eq.setC(c);
		System.out.println("Delta : " + eq.calcolaDelta());
		System.out.println("X1 : " + eq.calcolaX1());
		System.out.println("X2 : " + eq.calcolaX2());






	}

}
