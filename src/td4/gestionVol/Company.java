package td4.gestionVol;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private String nom ;
    private List<Vol> vols = new ArrayList<>();
        
    // Un constructeur du nom
    public Company(String nom){
        this.nom = nom ;
    }
    // Un getter pour acceder au listes  
    public List<Vol> getVolListe() {
        return vols ;
    }

    // Creer des vols
    public void propose(NumVol num,ZonedDateTime dep, ZonedDateTime ar){
        if(ar.compareTo(dep) <= 0){
            throw new IllegalArgumentException("Date de depart est superieure a la date d'arrivee !!! ");
        }
        else{
            Vol vol = new Vol(num,dep,ar);
            vols.add(vol);
        }
    }

    // Methode pour afficher les details de la compagnie
    public void info(){
        System.out.println("****** Datails du company: ******");
        System.out.println("Nom :"+nom);
        System.out.println("Liste des vols : ");
        for(Vol x:vols){
            System.out.println(x.getNumVol());
        }
    }

}
