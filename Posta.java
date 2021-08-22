import DomaciNedelja.Poruka;

import java.util.ArrayList;
import java.util.List;

public class Posta {

    private ArrayList<Poruka> poruke;

    public Posta(List<Poruka> poruke) {
        this.poruke = (ArrayList<Poruka>) poruke;
    }
    /*Konstruktori*/

    /*Metode*/

    //Dodaje poruku p u poruke ako ona vec ne postoji (gledano u odnosu na id)
    public void add(Poruka p) {
        for (Poruka poruka : poruke) {
            if (p.getId() != poruka.getId())
                poruke.add(poruka);
            return;
        }

    }

    //Brise poruku p iz poruka ako ona postoji (gledano u odnosu na id)
    public void remove(Poruka p) {
        for (Poruka poruka : poruke) {
            if (p.getId() == poruka.getId())
                poruke.remove(poruka.getId());
            return;
        }

    }

    //Ispisuje poruku p i ibrese je iz poruka, ako ona postoji (gledano u odnosu na id)
    public void send(Poruka p) {
        for (Poruka poruka : poruke) {
            if (p.getId() == poruka.getId())
                poruke.remove(poruka.getId());
            return;
        }
        System.out.println(p);
    }

    //Menja tekst poruke
    public void change(Poruka p, String msg) {
        for (int i = 0; i < poruke.size(); i++) {
            if (poruke.get(i) == p) {
                poruke.remove(poruke.get(i));
                return;
            }
        }
        System.out.println(msg);
    }

    // Vraca sumu poruke p ako ta poruka postoji u listi
    public int isplata(Poruka p) {
        for (int i = 0; i < poruke.size(); i++) {
            if (!(poruke.contains(p)))
                return 0;
        }
        return p.getSuma();
    }


    // U konzoli ispisuje, ako je suma nenegativna:
    // {posiljalac} salje {suma} para {primalac}-u, uz poruku:
    // {poruka}
    // a ako je suma negativna:
    // {posiljalac} primac {suma} para od {primalac}-a, uz poruku:
    // {poruka}
    // za svaki element iz liste!
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < poruke.size(); i++) {
            if (isplata(poruke.get(i)) > 0) {
                s = s.concat(poruke.get(i).getPosiljalac() + " salje "
                        + isplata(poruke.get(i)) + " para " + poruke.get(i).getPrimalac() + "-u, uz poruku:"
                        + "\n" + poruke.get(i).getPoruka() + "\n");
            } else {
                s = s.concat(poruke.get(i).getPosiljalac() + " prima "
                        + Math.abs(isplata((poruke.get(i)))) + " para " + poruke.get(i).getPrimalac()
                        + "-u, uz poruku:" + "\n" + poruke.get(i).getPoruka() + "\n");
            }
        }
        return s;
    }
}



