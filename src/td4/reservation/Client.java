package td4.reservation;

import java.time.ZonedDateTime;

public class Client {
    private String nom ;
    private String reference ;
    private String paiement ;
    private String contact ;

    // Constructeur
    public Client(String nom ,String reference ,String paiement ,String contact){
        this.nom = nom;
        this.reference = reference;
        this.paiement = paiement;
        this.contact = contact;
    }
    // effectuer une reservation
    private void effectue(String numero, ZonedDateTime date){
        Reservation resr1 = new Reservation(numero,date);
    }
}
