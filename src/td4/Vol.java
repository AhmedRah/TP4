package td4;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.LinkedHashSet;

public class Vol implements Etape {
    private NumVol numerovol ;
    private ZonedDateTime dateDepart;
    private ZonedDateTime dateArrivee;
    private Duration duree ;

    private Aeroport aeroDep ;
    private Aeroport aeroArr ;

    private boolean status ;
    // l'enssemble des escales du vol ,conteneant des escales uniques et ordonnee.
    private LinkedHashSet<Escale> escales = new LinkedHashSet<>();

    // Getteur du nom du vol
    public String getNumVol(){
        return numerovol.getNumVol();
    }
    // constructeure pour creer un vol 
    public Vol(NumVol numerovol, ZonedDateTime dateDepart, ZonedDateTime dateArrivee,Aeroport aeroDep,Aeroport aeroArr){
        this.numerovol = numerovol ;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.aeroDep = aeroDep;
        this.aeroArr = aeroArr;
        this.duree = calc_duree(dateDepart, dateArrivee);
    }
    // Calculating the duration of the flight
    private Duration calc_duree(ZonedDateTime d1, ZonedDateTime d2){
        return Duration.between(d1, d2);
    }
    // getters des dates du vols
    @Override
    public Duration getDuree(){
        return duree;
    }
    public ZonedDateTime getDateDepart() {
        return dateDepart;
    }
    public ZonedDateTime getDateArrivee() {
        return dateArrivee;
    }

    // Methode pour changer le status du vol
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
    // Methode pour ajouter des escales
    public void add_Escale(Escale escale){
        if(escale.getDuree().compareTo(this.duree) > 0 )
            throw new IllegalArgumentException("La duree d'escale ne doit pas depasser la duree du vol");
        this.escales.add(escale);
    }
    // Afficher les details du vol
    @Override
    public void info(){
        System.out.println("------------- Vol :"+numerovol.getNumVol()+"-------------");
        System.out.println("- Date de depart :"+ dateDepart);
        System.out.println("- Date d'arrivees :"+ dateArrivee);
        System.out.println("- Duree :"+ duree);
        // Afficher les escales
        for(Escale x:escales)
            x.info();
        // Afficher le status du Vol
        if(status)
            System.out.println("- Status du vol : Ouvert !");
        else
            System.out.println("- Status du vol : Fermer !");
    }
}
