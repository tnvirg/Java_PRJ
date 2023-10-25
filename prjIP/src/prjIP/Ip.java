package prjIP;

import java.util.Arrays;
import java.util.Scanner;

public class Ip {
	private int[] vet1;
	private int[] vet2;
	private int[] vet3; 
	private int[] vet4;
	private int[] sub;
	int i ;

	Scanner input = new Scanner(System.in);

	public int[] getVet1() {
		return vet1;
	}
	public void setVet1(int[] vet1) {
		this.vet1 = vet1;
	}
	public int[] getVet2() {
		return vet2;
	}
	public void setVet2(int[] vet2) {
		this.vet2 = vet2;
	}
	public int[] getVet3() {
		return vet3;
	}
	public void setVet3(int[] vet3) {
		this.vet3 = vet3;
	}
	public int[] getVet4() {
		return vet4;
	}
	public void setVet4(int[] vet4) {
		this.vet4 = vet4;
	}
	public Ip ()
	{
		vet1 = new int[4];
		vet2 = new int [4];
		vet3 = new int [4];
		vet4 = new int [4];
		sub = new int [4];

	}
	public void aggiungiDati () {
		for ( i = 0 ; i < vet1.length ; i++)
		{
			System.out.println("Inserisci il " + (i+1) + " byte dell 'ip ");
			vet1[i] = input.nextInt();
		}
		for (i = 0 ; i < vet2.length; i++)
		{
			System.out.println("Inserisci il " + (i+1) + " byte della subnet ");
			vet2[i] = input.nextInt();
		}
	}
	public void indirizzoRete()
	{
		for (  i = 0 ; i < vet1.length ; i++)
		{
			vet3[i] = vet1[i]&vet2[i];
		}
		  System.out.print("[ ");
	        for (int i = 0; i < vet3.length; i++)
	        	if (i<=2) {
		           System.out.print(vet3[i] +  ".");
	        	}
	        	else {
	        		System.out.print(vet3[i]);
	    	        System.out.println("]");

	        	}
	}
	/* public void invertiSubnet()
	{
		for (i=0 ; i< sub.length ; i++ )
		{
			sub[i]=~vet2[i]  & 0xFF;
		}
	}*/
	public void indirizzoBroadcast()
	{
		
			for (i=0 ; i< sub.length ; i++ )
			{
				sub[i]=~vet2[i] & 0xFF;
			}
			
	
		for ( i = 0 ; i < vet4.length ; i++)
		{
			vet4[i]=vet3[i] | sub[i];
		}
		  System.out.print("[ ");
	        for (int i = 0; i < vet4.length; i++)
	        	if (i<=2) {
		           System.out.print(vet4[i] +  ".");
	        	}
	        	else {
	        		System.out.print(vet4[i]);
	    	        System.out.println("]");
	        		}
	}
	@Override
	public String toString() {
		return "Ip [vet1=" + Arrays.toString(vet1) + ", vet2=" + Arrays.toString(vet2) + ", vet3="
				+ Arrays.toString(vet3) + ", vet4=" + Arrays.toString(vet4) + "]";
	}
	}
	

