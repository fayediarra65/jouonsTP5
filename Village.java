import java.util.ArrayList;
import java.util.List;

public class Village {
    // cette attribut prend une liste de personne 
    private List<Personnes> habitants;
    public Village(){
        this.habitants=new ArrayList<>();
    }
     
    // fonction qui permet d'ajouter une personne dans une liste
    public void ajouteHabitat(Personnes p){
        habitants.add(p);
    }



    public void viellir(){

    }
    public void production(){

    }

    public void impot(){

    }

    
}
