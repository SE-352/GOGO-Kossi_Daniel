import jdbc.Joueur;
import jdbc.JoueurController;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Joueur joueur1 = new Joueur("Daniel", "GOGO", "GOGK300100", 32);
        Joueur joueur2 = new Joueur("BBoy", "LIL-G", "DOGE456", 25);

        JoueurController terrain = new JoueurController();

        terrain.add(joueur1);
        terrain.add(joueur2);

        terrain.findAll();
    }
}