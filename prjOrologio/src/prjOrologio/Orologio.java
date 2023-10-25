package prjOrologio;

public class Orologio {
	private int ora;
	private int minuti;
	private int secondi;
		public Orologio (int ora,int minuti,int secondi)
		{
			this.ora=ora;
			this.minuti=minuti;
			this.secondi=secondi;
		}
		public Orologio (int ora,int minuti)
		{
			this.ora=ora;
			this.minuti=minuti;
			this.secondi=0;
		}
		public Orologio ()
		{
			this.ora=0;
			this.minuti=0;
			this.secondi=0;
		}
		public int getOra() {
			return ora;
		}
		public void setOra(int ora) {
			this.ora = ora;
		}
		public int getMinuti() {
			return minuti;
		}
		public void setMinuti(int minuti) {
			this.minuti = minuti;
		}
		public int getSecondi() {
			return secondi;
		}
		public void setSecondi(int secondi) {
			this.secondi = secondi;
		}
		public void aggiungiSecondi() {
			
				secondi++;
			 if (secondi==60)
			{
				minuti++;
				secondi=0;

			}
			 if (minuti==60)
			 {
				 ora++;
				 minuti=0;

			 }
			 if (ora==24)
			 {
				 ora=0;
			 }
		}
		@Override
		public String toString() {
			return "Orologio [ora=" + ora + ", minuti=" + minuti + ", secondi=" + secondi + "]";
		}
}