import java.util.ArrayList;
import java.util.List;

public class Pojisteny {

    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefonniCislo;
    private List<Pojisteny> pojisteny;

    //Konstruktor na inicializovani pojistene osoby
    public Pojisteny(String jmeno, String prijmeni, int vek, String telefonniCislo){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
        this.pojisteny = new ArrayList<Pojisteny>();
    }

    public String getJmeno() { //getter na jmeno

        return jmeno;
    }

    public String getPrijmeni() { //getter na prijmeni

        return prijmeni;
    }

    @Override //Override metoda
    public String toString(){
        return "Pojištěný: " + jmeno + " " + prijmeni + ",Věk: " + vek +",Telefon: " + telefonniCislo;
    }
}
