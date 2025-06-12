package p1;

public class Voiture extends Vehiculee {
    private int nbPortes;
    public Voiture(String marque,int a,int nb){
        super(marque,a);
        nbPortes=nb;
    }
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("nbportes est" + nbPortes);
    }
}
