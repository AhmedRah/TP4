package td4.gestionVol;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class Company {
    public String nom ;
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
        Vol vol1 = new Vol(num,dep,ar);
        vol1.info();

        vols.add(vol1);
    }


    public void info(){
        System.out.println("****** Datails du company: ******");
        System.out.println("Nom :"+nom);
        System.out.println("Liste des vols : ");
        for(Vol x:vols){
            System.out.println(x.getNumVol());
        }
    }
}
