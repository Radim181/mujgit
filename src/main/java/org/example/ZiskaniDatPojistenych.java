package org.example;

import java.util.Scanner;

/**
 * Pomocná třída pro získávání a validaci vstupu od uživatele.
 */
public class ZiskaniDatPojistenych {
    private final Scanner scanner;

    public ZiskaniDatPojistenych(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Získá a validuje jméno a příjmení(nesmí být prázdné).
     */
    public String zadejJmeno(String prompt) {
        String vstup;
        do {
            System.out.print(prompt);
            vstup = scanner.nextLine().trim();
            if (vstup.isEmpty()) {
                System.out.println("Toto pole nesmí být prázdné.");
            }
        } while (vstup.isEmpty());
        return vstup;
    }

    /**
     * Získá celé číslo (věk).
     */
    public int zadejCislo(String prompt) {
    boolean platneCislo = false;  // flag pro kontrolu správnosti vstupu
    int cislo = 0;

    while (!platneCislo) {  // Smyčka běží, dokud není zadáno platné číslo
        System.out.print(prompt);
        try {
            cislo = Integer.parseInt(scanner.nextLine());
            platneCislo = true;  // Pokud došlo k úspěšnému parsování, nastavíme flag na true
        } catch (NumberFormatException e) {
            System.out.println("Zadejte platné číslo.");
        }
        }
    return cislo;  // <- Nezapomeň na návratovou hodnotu
    }
    
    /**
     * Získá telefonní číslo (bez nutnosti zadat a bez validace formátu).
     */
    public String zadejTelefon(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}
