package p1;

public class Camion extends Vehiculee {
    private double capacitechargement;
    public Camion(String marque,int a,double capacitechargement){
        super(marque,a);
        this.capacitechargement=capacitechargement;
    }
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("capacitechargement est"+capacitechargement);
    }
}
