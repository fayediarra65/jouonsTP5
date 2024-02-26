import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Royaume {
    
   
    private List<Village> village;

    public Royaume(){
        this.village=new ArrayList<>();

    }

    public void viellir(){

    }
    public void production(){

    }

    public void impot(){

    }
    public boolean ajouteHabitat(Roturier r){
      if(village.isEmpty()){
        return true;
      }
      else{
        
        Random der=new Random();
        Village salynambé =village.get(der.nextInt(village.size()));
        salynambé.ajouteHabitat(r);
        return false;
      }
      
    }
    @Override
    public String toString() {
        return "Royaume [villages=" + village + "]";
    }
    

    
    
}
