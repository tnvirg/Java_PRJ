package prjRettangolo;
public class Rettangolo 
{
	private float base;
	private float altezza;
	
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltezza() {
		return altezza;
	}
	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}
	public float calcolaArea()
	{
		return base*altezza;
	}
	public float calcolaPerimetro()
	{
		return 2*(base*altezza);
	}
		
}
