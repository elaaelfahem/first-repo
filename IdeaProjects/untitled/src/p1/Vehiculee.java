package p1;

public class Vehiculee {
    protected String marque;
    protected int a;
    public Vehiculee(String marque,int a){
        this.marque=marque;
        this.a=a;
    }

    public int getA() {
        return a;
    }

    public String getMarque() {
        return marque;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
    public void afficherDetails(){
        System.out.println("l annee est "+a);
        System.out.println("la marque est"+marque);
    }
}

