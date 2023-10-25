package prjPunto;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n; 
		float x, y;
		int scelta;
		System.out.println(" Inserisci il numero massimo dei punti x ed y ");

		n = input.nextInt();
		Poligono p1 = new Poligono(n);
		do {
			System.out.println("1) Aggiungi punti X ed Y");
			System.out.println("2) Calcola il perimetro ");
			scelta = input.nextInt();
			switch (scelta) {
			
			case 1 :
				System.out.println("Inserisci X");
				x = input.nextFloat();
				System.out.println("Inserisci y");
				y = input.nextFloat();
				p1.aggiungiPunto(x, y);
				break;
			case 2 : 
				System.out.println(p1.calcolaPerimetro());
				break;
			case 3 : 
				System.out.println(p1.toString());
				break;
			}
		}while (scelta!=0);
	}

}
