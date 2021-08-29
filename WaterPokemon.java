package Pokemon;

public class WaterPokemon extends Pokemon {
    public WaterPokemon(String s, int i) {
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
        return name + " attacks the enemy with water!";
    }

    @Override
    public String defend() {
        return name + " defends himself with water!";
    }

    @Override
    public String wins() {
        return name + " wins FirePokemon!";
    }

    @Override
    public String losesFrom() {
        return name + " loses from GrassPokemon!";
    }
    // Napada: Vodom
    // Brani se: Vodom
    // Pobedjuje: Fire type
    // Gubi od: Grass type
}
