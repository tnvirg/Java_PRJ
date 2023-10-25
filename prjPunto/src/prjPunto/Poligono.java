package prjPunto;

import java.lang.Math;
import java.util.Arrays;

public class Poligono {
	private float[] vetX;
	private float[] vetY;
	private int nPunti;
	public float[] getVetX() {
		return vetX;
	}
	public void setVetX(float[] vetX) {
		this.vetX = vetX;
	}
	public float[] getVetY() {
		return vetY;
	}
	public void setVetY(float[] vetY) {
		this.vetY = vetY;
	}
	public int getnPunti() {
		return nPunti;
	}
	public void setnPunti(int nPunti) {
		this.nPunti = nPunti;
	}
	public Poligono (int n)
	{
		vetX = new float[n];
		vetY = new float[n];
	}
	public String aggiungiPunto (float x, float y)
	{
		if (nPunti < vetY.length)
		{
			vetX[nPunti]=x;
			vetY[nPunti]=y;
			nPunti++; 
			return "Voto inserito";
		}
		else return "voto non inserito";
	}
	public float calcolaPerimetro()
	{
		float perimetro = 0;
		for (int i = 0 ; i < nPunti ; i++) 
		{
			perimetro+=Math.sqrt(Math.pow(vetX[i]-vetX[(i+1)%nPunti],2)+Math.pow(vetY[i]-vetY[(i+1)%nPunti],2));
				
		}	
		return perimetro;
	}
	@Override
	public String toString() {
		return "Poligono [vetX=" + Arrays.toString(vetX) + ", vetY=" + Arrays.toString(vetY) + ", nPunti=" + nPunti
				+ "]";
	}
	

}
