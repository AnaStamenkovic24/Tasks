package Pokemon;

public class GrassPokemon extends Pokemon {
    public GrassPokemon(String s, int i) {
        this.name = s;
        this.health = i;
    }
    public String logAll() {
        return attack().toString()
                + defend().toString()
                + wins().toString()
                + losesFrom().toString();
    }

    @Override
    public String attack() {
        return name + " attacks the enemy with grass!";
    }

    @Override
    public String defend() {
        return name + " defends himself by avoiding!";
    }

    @Override
    public String wins() {
        return name + " wins WaterPokemon!";
    }

    @Override
    public String losesFrom() {
        return name + " loses from FirePokemon!";
    }


    // Napada: Travom
    // Brani se: Izbegava
    // Pobedjuje: Water type
    // Gubi od: Fire type

}
