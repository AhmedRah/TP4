package td4.gestionVol;

import com.sun.source.tree.InstanceOfTree;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Vol {
    private NumVol numerovol ;
    private ZonedDateTime dateDepart;
    private ZonedDateTime dateArrivee;
    private Duration duree ;
    private boolean status ;
    // l'enssemble des escales du vol ,conteneant des escales uniques et ordonnee.
    private LinkedHashSet<Escale> escales = new LinkedHashSet<>();

    // Getteur du nom du vol
    public String getNumVol(){
        return numerovol.getNumVol();
    }
    // constructeure pour creer un vol 
    public Vol(NumVol numerovol, ZonedDateTime dateDepart, ZonedDateTime dateArrivee){
        this.numerovol = numerovol ;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.duree = calc_duree(dateDepart, dateArrivee);
    }
    // Calculating the duration of the flight
    private Duration calc_duree(ZonedDateTime d1, ZonedDateTime d2){
        return Duration.between(d1, d2);
    }

    // changing the flight status
    public void ouvrir(){
        this.status = true ;
    }
    public void fermer(){
        if(this.status == false){
            throw new IllegalArgumentException("vol n'est pas encore ouvert");
        }
        else{
            this.status = false;
        }
    }

    // Associer les aeroport de depart et d'arrivee au vol
    public void depart (String nom , String code){
        Aeroport aeroport = new Aeroport(nom , code);
    }
    public void arrivee (String nom , String code){
        Aeroport aeroport = new Aeroport(nom , code);
    }

    public void add_Escale(Escale escale){
        this.escales.add(escale);
    }



    public void info(){
        System.out.println("****** Details Du Vol ******");
        System.out.println("NUmero de vol : "+numerovol.getNumVol());
        System.out.println("Date de depart :"+ dateDepart);
        System.out.println("Date d'arrivees :"+ dateArrivee);
        System.out.println("Duree :"+ duree);
        System.out.println("Status du vol :"+status);
    }
}
