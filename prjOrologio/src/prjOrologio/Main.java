package prjOrologio;
public class Main {

	public static void main(String[] args) {
		Orologio o1 = new Orologio (23,59,59);
		o1.aggiungiSecondi();
		System.out.println(o1.toString());
		Orologio o2 = new Orologio(19,20) ;
		System.out.println(o2.toString());
	}

}
