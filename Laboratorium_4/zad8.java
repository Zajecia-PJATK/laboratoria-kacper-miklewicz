class Main {
    public static void main(String[] args) {
        Kosiarka kosiarka = new Kosiarka("STIHL", "RM 253", "300cm3", Maszyna.RodzajSilnika.SIECIOWY, false, true, 5);
        kosiarka.wyswietl();
    }
}

abstract class Maszyna {
    protected String marka;
    protected String nazwa;
    protected String pojemnoscSilnika;
    protected enum RodzajSilnika {
        SIECIOWY, AKUMULATOROWY, SPALINOWY
    };
    protected RodzajSilnika rodzajSilnika;
}

class Kosiarka extends Maszyna {
    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;

    public Kosiarka(String marka, String nazwa, String pojemnoscSilnika, RodzajSilnika rodzajSilnika, boolean czyMelekser, boolean czyNaped, int liczbaOstrzy) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzajSilnika = rodzajSilnika;
        this.czyMelekser = czyMelekser;
        this.czyNaped = czyNaped;
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public boolean isCzyMelekser() {
        return czyMelekser;
    }

    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }

    public boolean isCzyNaped() {
        return czyNaped;
    }

    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }

    public int getLiczbaOstrzy() {
        return liczbaOstrzy;
    }

    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public void wyswietl() {
        System.out.println("Kosiarka" +
                "\n----------------" +
                "\nMarka: " + this.marka +
                "\nNazwa: " + this.nazwa +
                "\nPojemnosc silnika: " + this.pojemnoscSilnika +
                "\nRodzaj silnika: " + this.rodzajSilnika +
                "\nMelekser: " + (this.isCzyMelekser() ? "tak" : "nie") +
                "\nNaped: " + (this.isCzyNaped() ? "tak" : "nie") +
                "\nLiczba ostrzy: " + this.getLiczbaOstrzy());
    }
}
