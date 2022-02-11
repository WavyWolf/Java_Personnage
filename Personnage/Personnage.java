package Personnage;
public class Personnage {
    
    //Le Constructeur
        public Personnage (String name , int life){
            this.nom = name;
            this.vie = life;
        }
    // Accesseur du nom du Personage
        public String LeNom (){
            return this.nom;
        }
    // Les Attributs 
        private String nom;
        private int vie;
}
