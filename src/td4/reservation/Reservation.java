package td4.reservation;

import td4.gestionVol.NumVol;
import td4.gestionVol.Vol;

import java.time.ZonedDateTime;

public class Reservation {
    private String numero ;
    private ZonedDateTime date ;
    private boolean status ;

    // Constructeur
    public Reservation(String numero ,ZonedDateTime date){
        this.numero = numero;
        this.date = date;
    }

    // Changer le status de la reservation
    private void confirmer(){
        this.status = true ;
    }
    private void annuler(){
        this.status = false ;
    }
    //setter pour changer le status
    public Reservation(Boolean status){
        if(status)
            confirmer();
        else
            annuler();
    }

    // Methodes concerne
    // 1- Pour passagers
    public void concerne(String nom){
        Passager passager = new Passager(nom);
    }
    // 2- Pour Vols
    public void concerne(NumVol numero,ZonedDateTime depart ,ZonedDateTime arrivee){
        final Vol vol = new Vol(numero,depart,arrivee);
    }
}
