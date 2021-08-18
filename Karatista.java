package Borenje;
import java.util.ArrayList;
import java.util.Arrays;

public class Karatista {

    //String ime; Ime karatiste
    //int godine; Kolko karatista ima godina
    //String rang; Koji je njegov rang.
    // Rangovi u karateu ide od 10Kyu, 9Kyu, ..., 1kyu, 1Dan, 2Dan, ..., 10Dan
    //String[] kata; Lista karate formi
    private String ime;
    private int godine;
    private String rang;
    private String[] kata;

    public Karatista(String ime, int godine, String rang, String[] kata) {
        this.ime = ime;
        if (godine <= 0)
            this.godine = 100;
        System.out.println("Postavljena je podrazumevana vrednost(jer ste uneli nepozitivnu.");
        this.godine = godine;
        this.rang = rang;
        this.kata = kata;
    }
    //Napraviti gettere i setter za sve ove atribute, ali paziti na validnost polja!


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        if (godine <= 0)
            this.godine = 100;
        System.out.println("Postavljena je podrazumevana vrednost(jer ste uneli nepozitivnu.");
        this.godine = godine;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public String[] getKata(int i) {
        return kata;
    }

    public void setKata(String[] kata) {
        this.kata = kata;
    }


    //Napraviti metod napadni(int index), koja za prosledjeni indeks ispisuje poruku:
    // "Karatista {ime} napada sa {kata[index]} katom".

    public String napadni(int index) {
        return "Karatista " + this.ime +
                " napada sa " +
                Arrays.toString(this.getKata(index)) + " katom";
    }

    public ArrayList<String> x = new ArrayList<>();




    //Napraviti metod vatreniNapad(), koja ispisuje istu poruku kao i napadni() metod, osim sto bira nasumicnu katu.
    public String vatreniNapad() {
        double randomIndex = Math.random();
        String randomKata = kata[(int) randomIndex];
        return "Karatista " + ime + " napada sa " + randomKata + " katom.";
    }
    @Override
    public String toString() {
        return "Karatista{" +
                "ime='" + ime + '\'' +
                ", godine=" + godine +
                ", rang='" + rang + '\'' +
                ", kata=" + Arrays.toString(kata) +
                '}';
    }
}

