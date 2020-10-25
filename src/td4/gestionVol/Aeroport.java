package td4.gestionVol;

public class Aeroport {
    public String nom ;
    public String code ;


    // methode deservir
    public Aeroport(String nom_ville){
        Ville ville = new Ville(nom_ville);
    }
    //getters
    public String get_nom (){
        return nom ;
    }
    public String get_code (){
        return code ;
    }


}
