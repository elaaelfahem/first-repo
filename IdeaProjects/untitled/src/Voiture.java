class Voiture extends Vehicule {
    private int nbPortes;
    public Voiture(String marque,int a,int nb){
        super(String marque,int a);
        nbPortes=nb;
    }
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("nbportes est"+nbPortes);
    }

}
