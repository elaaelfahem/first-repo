package p1;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome! voiture ou Moto ou Camion");
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        if(s.equals("Moto"))
            System.out.printf("marque");
            String m = sc.nextLine();
            System.out.printf("annee");
            int m = sc.nextInt();
            System.out.printf("estelectrique");
            boolean estElectrique = sc.nextBoolean();
            
    }
}
