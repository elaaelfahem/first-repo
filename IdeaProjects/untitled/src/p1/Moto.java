package p1;

public class Moto extends Vehiculee{
    private boolean estElectrique;
    public Moto(String marque,int a,boolean estElectrique){
        super(marque, a);
        this.estElectrique=estElectrique;
    }
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("estelectrique est"+estElectrique);
    }
}
