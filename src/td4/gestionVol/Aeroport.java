package td4.gestionVol;

public class Aeroport {
    private String nom ;
    private String code ;
    private Ville ville ;

    public Aeroport(String nom ,String code){
        this.nom =  nom ;
        this.code = code;
    }

    // associer l'aeroport a une ville
    public Aeroport(Ville ville){
        this.ville = ville ;
    }
    //getters
    public String get_nom (){
        return nom ;
    }
    public String get_code (){
        return code ;
    }


}
