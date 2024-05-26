import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PojistnaAplikace pojistnaAplikace = new PojistnaAplikace();
        Scanner sc = new Scanner(System.in);

        //Menu výběr
        while(true){
            System.out.println("Vyberte si akci:");
            System.out.println("1- Přidat nového pojištěného");
            System.out.println("2- Vypsat všechny pojištěné");
            System.out.println("3- Vyhledat pojištěného");
            System.out.println("4- Konec");
            int vyber = sc.nextInt();
            sc.nextLine();

            //Výběr pro uživatele
            switch(vyber) {
                case 1:
                    System.out.println("Zadej jméno: ");
                    String jmeno = sc.nextLine();
                    System.out.println("Zadejte přijmení: ");
                    String prijmeni = sc.nextLine();
                    System.out.println("Zadejte telefonní číslo: ");
                    String telefonniCislo = sc.nextLine();
                    System.out.println("Zadejte věk: ");
                    int vek = sc.nextInt();
                    sc.nextLine();
                    Pojisteny pojisteny = new Pojisteny(jmeno, prijmeni, vek, telefonniCislo);
                    pojistnaAplikace.addPojisteny(pojisteny);
                    System.out.println("Pojištěný byl úspěšně přidán.");
                    break;
                case 2:
                    pojistnaAplikace.zobrazVsechnyPojisteny();
                    break;
                case 3:
                    System.out.println("Zadejte jméno: ");
                    String hledejJmeno = sc.nextLine();
                    System.out.println("Zadejte přijmení: ");
                    String hledejPrijmeni = sc.nextLine();
                    Pojisteny nalezenyPojisteny = pojistnaAplikace.hledejPojisteny(hledejJmeno, hledejPrijmeni);
                    if(nalezenyPojisteny != null){
                        System.out.println("Pojištěný nalezen: " + nalezenyPojisteny);
                    } else {
                        System.out.println("Pojištěný nenalezen");
                    }
                    break;
                case 4:
                    System.out.println("Ukončuji program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Neplatná volba, zkuste to znovu.");
                    break;























            }
        }








        }

    }

