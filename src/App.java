public class App {
    public static void main(String[] args) throws Exception {

        Negozio n = new Negozio();
        n.elencaGiochi();

        
        n.aggiungiGioco(new Gioco("Zelda", "Avventura"));
        n.aggiungiGioco(new Gioco("Mario", "Avventura"));
        n.aggiungiGioco(new Gioco("Crash Bandicoot", "Singleplayer"));
        n.aggiungiGioco(new Gioco("Rocket League", "Sport"));
        n.aggiungiGioco(new Gioco("FIFA", "Sport"));
        n.aggiungiGioco(new Gioco("Minecraft", "Sopravvivenza"));
        n.elencaGiochi();

        System.out.println( n.trovaGioco("Zelda"));
        System.out.println( n.trovaGioco("Mario Kart"));
        
        n.eliminaGioco("FIFA");
        n.elencaGiochi();

    }
}
