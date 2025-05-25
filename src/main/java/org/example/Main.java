package org.example;

import java.util.Scanner;

/**
 * Hlavní třída aplikace pro evidenci pojištěných osob.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DatabazePojistenych db = new DatabazePojistenych();
        ZiskaniDatPojistenych input = new ZiskaniDatPojistenych(scanner);

        boolean running = true;

        // Zobrazení hlavního menu
            while (running) {
            System.out.println("\n--- Evidence pojištěných ---");
            System.out.println("1. Přidat pojištěného");
            System.out.println("2. Vypsat všechny pojištěné");
            System.out.println("3. Vyhledat pojištěného");
            System.out.println("4. Konec");
            System.out.print("Zadejte volbu: ");
            String volba = scanner.nextLine();

            // Reakce na volbu uživatele
            switch (volba) {
                // Vytvoření nového pojištěného
                case "1":
                    String jmeno = input.zadejJmeno("Zadejte jméno: ");
                    String prijmeni = input.zadejJmeno("Zadejte příjmení: ");
                    int vek = input.zadejCislo("Zadejte věk: ");
                    String telefon = input.zadejTelefon("Zadejte telefon: ");
                    db.pridejPojisteneho(new PojistenaOsoba(jmeno, prijmeni, vek, telefon));
                    break;
                // Výpis všech pojištěnýc
                case "2":
                    db.vypisPojistene();
                    break;
                // Vyhledání pojištěného podle jména a příjmení
                case "3":
                    String hledaneJmeno = input.zadejJmeno("Zadejte jméno: ");
                    String hledanePrijmeni = input.zadejJmeno("Zadejte příjmení: ");
                    db.vyhledejPojisteneho(hledaneJmeno, hledanePrijmeni);
                    break;
                // Ukončení programu
                case "4":
                    running = false;
                    System.out.println("Ukončuji aplikaci.");
                    break;
                default:
                    System.out.println("Neplatná volba.");
            }
        }
    }
}
