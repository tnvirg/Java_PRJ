package prjIP;

import java.util.Scanner;
public class Main 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int scelta ;
		int ip ; 
		int subnet ; 
		Ip p1 = new Ip();
		do 
		{
			System.out.println("1) Inserisci ip ");
			System.out.println("2) Inserisci subnet mask ");
			System.out.println("3) Calcola indirizzo di rete  ");
			System.out.println("4) Calcola indirizzo di broadcast  ");
			System.out.println("5) Inizializza vettore  ");
			System.out.println("6) Tostring  ");
			

			scelta = input.nextInt();
			switch (scelta) 
			{
			case 1 : 
				if (p1.getContaIp() == 4  ) {
					System.out.println("Vettore pieno, non é possibile inserire ulteriori dati");
				}
				else 
				{
					for (int i = 0 ; i<p1.getVetIp().length ; i++)
					{
							System.out.println("Inserisci il " + (i+1) + "byte " + "dell'indirizzo IP");
							ip = input.nextInt();
							System.out.println( p1.aggiungiIp(ip)); 
					}
				}
				break;
			case 2 : 
				if (p1.getContaSubnet()== 4  ) {
					System.out.println("Vettore pieno, non é possibile inserire ulteriori dati");
				}
				else {
					for (int i = 0 ; i<p1.getVetSubnet().length ; i++)
					{
							System.out.println("Inserisci il " + (i+1) + "byte " + "della subnet mask");
							subnet = input.nextInt();
							System.out.println( p1.aggiungiSubnet(subnet));
					}
				}
				break;
			case 3 : 
				p1.indirizzoRete();
				break;
			case 4 :
				p1.indirizzoBroadcast();
				break;
			case 5 : 
				p1.resetVet();
				break;
			case 6 : 
				System.out.println(p1.toString());
				break;
			
			
		}
				
			}while (scelta!=0 );
		}
	}

	


	

