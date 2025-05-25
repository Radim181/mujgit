package org.example;

import java.util.ArrayList;

/**
 * Třída pro správu seznamu pojištěných osob.
 */
public class DatabazePojistenych {
    private final ArrayList<PojistenaOsoba> seznam;

    /**
     * Konstruktor inicializuje prázdný seznam pojištěných.
     */
    public DatabazePojistenych() {
        seznam = new ArrayList<>();
    }

    /**
     * Přidá pojištěného do seznamu.
     */
    public void pridejPojisteneho(PojistenaOsoba p) {
        seznam.add (p);
        System.out.println("Pojištěný byl přidán.");
    }

    /**
     * Vypíše všechny pojištěné.
     */
    public void vypsatPojistene() {
        if (seznam.isEmpty()) {
            System.out.println("Seznam pojištěných je prázdný.");
        } else {
            System.out.println("\nSeznam pojištěných:");
            for (PojistenaOsoba p : seznam) {
                System.out.println(p);
            }
        }
    }

    /**
     * Vyhledá pojištěného podle jména a příjmení.
     */
    public void vyhledatPojisteneho(String jmeno, String prijmeni) {
        boolean nalezeno = false;
        for (PojistenaOsoba p : seznam) {
            if (p.getJmeno().equalsIgnoreCase(jmeno) && p.getPrijmeni().equalsIgnoreCase(prijmeni)) {
                System.out.println("Nalezen: " + p);
                nalezeno = true;
            }
        }
        if (!nalezeno) {
            System.out.println("Pojištěný nebyl nalezen.");
        }
    }
}
