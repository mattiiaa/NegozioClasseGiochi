public class Negozio {
    private Gioco elencoGiochi[];
    public static int MAX = 100;
    private int contaGiochi;

    public Negozio() {
        elencoGiochi = new Gioco[MAX];
        contaGiochi = 0;
    }

    public boolean aggiungiGioco(Gioco g) {
        // Controllo se l'array è pieno
        if (contaGiochi == MAX - 1) {
            return false;
        }
        elencoGiochi[contaGiochi] = g;
        contaGiochi++;

        return true;

    }

    public int trovaGioco(String titolo) {
        int trovato = -1;
        for (int i = 0; i < contaGiochi; i++) {
            if (elencoGiochi[i].getTitolo().equals(titolo)) {
                return i;
            }
        }
        return trovato;
    }

    public void eliminaGioco(String titolo) {
        int pos = trovaGioco(titolo);
        if (pos != -1) {
            for (int i = pos; i < contaGiochi - 1; i++) {
                elencoGiochi[i] = elencoGiochi[i + 1];
            }
            elencoGiochi[contaGiochi - 1] = null;
            contaGiochi--;
        }
    }

    public int getNumeroGiochi() {
        return contaGiochi;
    }

    public void elencaGiochi() {
        if (contaGiochi == 0) {
            System.out.println("Nel mio negozio al momento non ci sono giochi.");
        } else {
            System.out.println("Nel mio negozio ci sono i seguenti giochi: ");
            for (int i = 0; i < contaGiochi; i++) {
                System.out.println(elencoGiochi[i]);
            }
        }

    }

}
