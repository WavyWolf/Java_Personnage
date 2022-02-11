import Personnage.*;
public class jeuPersonnage {

    public static void main(String[] args) {
        Personnage UnSorcier = new Personnage("Sorcier", 200);
        System.out.println("Bienvenue " + UnSorcier.LeNom());
    }
}