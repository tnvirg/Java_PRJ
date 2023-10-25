package prjStudente;
import 	java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		Scanner input = new Scanner(System.in);
		String nome;
		String cognome;
		int nMaterie;
		int voto=0;
		System.out.println("Inserisci nome");
		nome = input.nextLine();
		System.out.println("Inserisci cognome");
		cognome = input.nextLine();
		System.out.println("Inserisci il numero delle materie");
		nMaterie = input.nextInt();
		Studente s1 = new Studente(nome,cognome,nMaterie);
		while (s1.getnVoti()<nMaterie)
		{
			System.out.println("Inserisci il  " + (s1.getnVoti()+1) + " Voto");
			voto = input.nextInt();
			System.out.println(s1.aggiungiVoto(voto));
		}
		System.out.println(s1.toString());
	}
	
	


	

}
