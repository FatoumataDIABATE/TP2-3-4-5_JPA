package banque;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
             var em = emf.createEntityManager()) {
        }catch (Exception ex) {
            System.out.println("Erreur : " + ex.getMessage());
        }



    }

}