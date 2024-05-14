public class Gioco {
    private String titolo;
    private String tipo;

    public Gioco() {
    }

    public Gioco(String titolo, String tipo) {
        this.titolo = titolo;
        this.tipo = tipo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean equals(Gioco g) {
        if (this == g) {
            return true;
        } 
        else if (g instanceof Gioco) {
            if (this.titolo.equals(g.getTitolo()) && this.tipo.equals(g.getTipo())) {
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return this.titolo + " è di tipo: " + this.tipo;
    }
}