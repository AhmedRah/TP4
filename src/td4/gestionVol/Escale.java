package td4.gestionVol;

import java.time.Duration;
import java.time.ZonedDateTime;

public class Escale {
    private ZonedDateTime depart ;
    private ZonedDateTime arrivee ;
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


}
