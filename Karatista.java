package Borenje;

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

    public boolean IsValidRang() {

        for (int i = 0; i < rang.length(); i++) {
            if (!Character.isDigit(rang.charAt(0)))
                return false;
            else {
                if (rang.charAt(0) >= 1 && rang.charAt(0) < 10) {
                    if (rang.substring(1, rang.length() - 1).equals("Kyu")
                            || rang.substring(1, rang.length() - 1).equals("Dan"))
                        return true;

                    else if (Character.isDigit(rang.charAt(0)) && Character.isDigit(rang.charAt(1)))
                        if (rang.charAt(0)==1 && rang.charAt(1)==0 &&
                                (rang.substring(2, rang.length() - 1).equals("Kyu")
                                || rang.substring(2, rang.length() - 1).equals("Dan")))
                            return true;
                }
            }
        }
        return false;
    }


    public Karatista(String ime, int godine, String rang, String[] kata) {
        this.ime = ime;
        if (godine <= 0)
            this.godine = 100;
        System.out.println("Postavljena je podrazumevana vrednost(jer ste uneli nepozitivnu.");
        this.godine = godine;
        if (!IsValidRang()) {
            this.rang = "10Kyu";
            System.out.println("Postavljena je podrazumevana vrednost(jer ste uneli nepostojeci rang.");
        } else this.rang = rang;
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
        System.out.println("Nije promenjena vrednost.");
        this.godine = godine;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        if(IsValidRang()){
        this.rang = "10Kyu";
        System.out.println("Nije promenjena vrednost.");}
        else this.rang =rang;

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


    //Napraviti metod vatreniNapad(), koja ispisuje istu poruku kao i napadni() metod, osim sto bira nasumicnu katu.
    public String vatreniNapad() {
        double randomIndex = Math.floor(Math.random() * kata.length - 1);
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

