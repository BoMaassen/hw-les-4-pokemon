package pokemon.pokemon_type;

import pokemon.Pokemon;

public class FirePokemon extends Pokemon {
    private int firepower;
    private String fireAttack;

    public FirePokemon(String name, int level, int firepower, String fireAttack) {
        super(name, level);
        this.firepower = firepower;
        this.fireAttack = fireAttack;
    }

    public void fireSpin() {
        System.out.println("Pokemon attacked with Fire Spin");
    }
    public void ember() {
        System.out.println("Pokemon attacked with Ember");
    }

    public void eats() {
        System.out.println("Fire pokemon eats");
    }

    public int getFirepower() {
        return this.firepower;
    }

    public String getFireAttack() {
        return this.fireAttack;
    }

    public void setFireAttack(String fireAttack) {
        this.fireAttack = fireAttack;
    }

    public void setFirepower (int firepower) {
        this.firepower = firepower;
    }
}
