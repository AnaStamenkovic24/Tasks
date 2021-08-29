package Pokemon;


public class FirePokemon extends Pokemon{
    public FirePokemon(String s, int i) {
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
        return name + " attacks the enemy with fire!";
    }

    @Override
    public String defend() {
        return name + " defends himself physically";
    }

    @Override
    public String wins() {
        return name + " wins GrassPokemon!";
    }

    @Override
    public String losesFrom() {
        return name + " loses from WaterPokemon!";
    }
    // Napada: Vatrom
    // Brani se: Telesno
    // Pobedjuje: Grass type
    // Gubi od: Water type
}