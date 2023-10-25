Programma strutturato 5 Punti
  1) verifica appartenenza dati due indirizzi ip e due subnet mask. In particolare inserendo questi dati nelle celle della matrice verra' effettuato il confronto e verrá restituita una stringa.
  2) Inserimento indirizzo ip e subnet mask, in due vettori di interi da [4] celle, andremo a inserire il byte del dato richiesto.
  3) Calcolo indirizzo di rete. Attraverso & bit a bit tra I.rete e Subnet mask inseriti nel punto due avremo restituito l'indirizzo ip.
  4) Calcolo indirizzo di broadcast. Inversione subnet mask , quando i bit sono a 0 si sostituisce con 1 e viceversa. Or logico tra maschera invertita e indirizzo rete .
  5) To string 
