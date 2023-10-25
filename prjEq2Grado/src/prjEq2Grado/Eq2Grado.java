package prjEq2Grado;
public class Eq2Grado {
	private float a;
	private float b;
	private float c;
	
	public float getA() {
		return a;
	}
	public void setA(float a) {
		this.a=a;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b=b;
	}
	public float getC() {
		return c;
	}
	public void setC(float c) {
		this.c=c;
	}
	public float calcolaDelta() {
		return b*b-4*(a*c);
	}
	public float calcolaX1() {
		return (float) (-b+Math.sqrt(calcolaDelta()))/(2*a);
	}
	public float calcolaX2() {
		return (float) (-b-Math.sqrt(calcolaDelta()))/(2*a);
	}
	
}
