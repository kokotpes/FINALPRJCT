import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PojistnaAplikace {
    private ArrayList<Pojisteny> pojistnyList;

    public PojistnaAplikace(){
        pojistnyList = new ArrayList<>();
    }

    public  void addPojisteny(Pojisteny pojisteny){
        pojistnyList.add(pojisteny);
    }
    public void zobrazVsechnyPojisteny(){
        for (Pojisteny pojisteny : pojistnyList){
            System.out.println(pojisteny);
        }
    }
    public Pojisteny hledejPojisteny(String jmeno, String prijmeni){
        for(Pojisteny pojisteny : pojistnyList){
            if(pojisteny.getJmeno().equals(jmeno)&&pojisteny.getPrijmeni().equals(prijmeni)){
                return pojisteny;
            }
        }
        return null; //vrat null kdyz nenajde pojisteneho
    }






}
