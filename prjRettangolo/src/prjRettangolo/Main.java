package prjRettangolo;
import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Rettangolo r = new Rettangolo();
		Scanner input = new Scanner(System.in);
		float base = 5;
		float altezza = 2; 
		System.out.println("Inserisci la base");
		base = input.nextFloat();
		altezza = input.nextFloat();
		r.setBase(base);
		r.setAltezza(altezza);
		System.out.println("Area : " + r.calcolaArea());
		System.out.println("Perimetro : " + r.calcolaPerimetro());
		
	}
}