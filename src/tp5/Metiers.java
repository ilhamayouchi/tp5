package tp5;

abstract class Personne {
 protected String nom;

 public Personne(String nom) {
     this.nom = nom;
 }


 abstract void affiche();
}


class Menuisier extends Personne {
 public Menuisier(String nom) {
     super(nom);
 }

 @Override
 void affiche() {
     System.out.println("Je suis " + nom + " le Menuisier");
 }
}


class Plombier extends Personne {
 public Plombier(String nom) {
     super(nom);
 }

 @Override
 void affiche() {
     System.out.println("Je suis " + nom + " le Plombier");
 }
}

public class Metiers {
 public static void main(String[] args) {
     Personne[] personnes = new Personne[3];
     personnes[0] = new Menuisier("Paul");
     personnes[1] = new Plombier("Jean");
     personnes[2] = new Menuisier("Adrien");
     
     for (int i = 0; i < personnes.length; i++) {
         personnes[i].affiche();
     }
 }
}
