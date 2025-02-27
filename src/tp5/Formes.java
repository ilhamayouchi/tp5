package tp5;


abstract class Forme {
 abstract double getSurface();
}
class Carre extends Forme {
 private double cote;


 public Carre(double cote) {
     this.cote = cote;
 }

 
 @Override
 double getSurface() {
     return cote * cote;
 }

 @Override
 public String toString() {
     return "Carré ( coté " + cote + " cm )";
 }
}


class Cercle extends Forme {
 private double rayon;

 
 public Cercle(double rayon) {
     this.rayon = rayon;
 }

 
 @Override
 double getSurface() {
     return Math.PI * rayon * rayon;
 }

 @Override
 public String toString() {
     return "Cercle ( rayon " + rayon + " cm )";
 }
}


public class Formes {
 public static void main(String[] args) {
     Forme[] figures = new Forme[3];
     figures[0] = new Carre(2);  
     figures[1] = new Cercle(3); 
     figures[2] = new Carre(5.2); 

     // Affichage des surfaces
     for (int i = 0; i < figures.length; i++) {
         System.out.println(figures[i] + " : surface = " + String.format("%.2f", figures[i].getSurface()) + " cm²");
     }
 }
}
