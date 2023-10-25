package prjIP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int scelta ;
		Ip p1 = new Ip();
		verificaAppartenenza a1 = new verificaAppartenenza();
		do {
			System.out.println("1) Verifica appartenenza due ip ");
			System.out.println("2) Inserisci ip e subnet mask ");
			System.out.println("3) Calcola indirizzo di rete  ");
			System.out.println("4) Calcola indirizzo di broadcast  ");
			scelta = input.nextInt();
			switch (scelta) {
			case 1 : 
				System.out.println(a1.verificaIp());   
				
				break;
			case 2 : 
				p1.aggiungiDati();
				break;
			case 3 : 
				p1.indirizzoRete();
				break;
			case 4 :
				p1.indirizzoBroadcast();
				break;
			case 5 : 
				System.out.println(p1.toString());
				break;
			}
		}while (scelta!=0 );
	}

}
