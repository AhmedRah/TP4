package td4.gestionVol;

import java.time.Duration;
import java.time.ZonedDateTime;

public class Escale {
    private ZonedDateTime arrivee ;
    private ZonedDateTime depart ;
    private Aeroport aero_esc ;

    private Duration duree ;

    // Constructeur
    public Escale(ZonedDateTime depart ,ZonedDateTime arrivee){
        this.depart = depart ;
        this.arrivee = arrivee ;
        this.duree = calc_duree(depart,arrivee);
    }
    // Calculating the duration of the layover
    private Duration calc_duree(ZonedDateTime d1, ZonedDateTime d2){
        return Duration.between(d1, d2);
    }

    // Associer un aeroport a un escale
    public Escale(Aeroport aero_esc){
        this.aero_esc = aero_esc ;
    }

}