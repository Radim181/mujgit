package org.example;

/**
 * Třída reprezentuje pojištěnou osobu.
 */
public class PojistenaOsoba {
    private final String jmeno;
    private final String prijmeni;
    private final int vek;
    private final String telefon;

    /**
     * Konstruktor pro vytvoření pojištěného.
     */
    public PojistenaOsoba(String jmeno, String prijmeni, int vek, String telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * Vrací textovou reprezentaci pojištěného.
     */
    @Override
    public String toString() {
        return jmeno + " " + prijmeni + ", věk: " + vek + ", telefon: " + telefon;
    }
}