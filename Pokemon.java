package Pokemon;
//Dopuniti proslednjene klase na odgovarajuci nacin.
//Napraviti interfejs sa 4 metode koje vracaju String
public abstract class Pokemon implements Attackable{
    String name;
    String type;
    int health;

    public Pokemon(String name, String type, int health) {
        this.name = name;
        this.type = type;
        this.health = health;
    }

    public Pokemon() {
    }

    public abstract String logAll(); //Ispisuje kako pokemon napada, kako se brani, koga pobedjuje i od koga gubi


}
