package prjStudente;
import java.util.Arrays;

public class Studente {
	private String nome;
	private String cognome;
	private int[] pagella;
	private int nVoti;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int[] getPagella() {
		return pagella;
	}
	public void setPagella(int[] pagella) {
		this.pagella = pagella;
	}
	public int getnVoti() {
		return nVoti;
	}
	public void setnVoti(int nVoti) {
		this.nVoti = nVoti;
	}
	public Studente (String nome, String cognome, int nMaterie) {
		this.nome=nome;
		this.cognome=cognome;
		nVoti=0;
		pagella = new int[nMaterie];
	}
	public String aggiungiVoto(int voto)
	{ 
		if (nVoti<pagella.length && voto>=0 && voto<=10) {
			pagella[nVoti]=voto;
			nVoti++;	
			return  "voto inserito";
		}
		else return "voto non inserito"; 
		
	}
	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", pagella=" + Arrays.toString(pagella) + ", nVoti="
				+ nVoti + "]";
	}

}
