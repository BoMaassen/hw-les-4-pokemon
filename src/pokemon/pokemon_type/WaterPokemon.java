package pokemon.pokemon_type;

import pokemon.Pokemon;

public class WaterPokemon extends Pokemon {
    private int waterPower;
    private String waterAttack;

    public WaterPokemon(String name, int level, int waterPower, String waterAttack) {
        super(name, level);
        this.waterPower = waterPower;
        this.waterAttack = waterAttack;
    }

    public void waterGun() {
        System.out.println("Pokemon attacked with water gun");
    }

    public void surf() {
        System.out.println("Pokemon attacked with surf");
    }

    public void eats() {
        System.out.println("Water pokemon eats");
    }

    public int getWaterPower() {
        return this.waterPower;
    }

    public String getWaterAttack() {
        return this.waterAttack;
    }

    public void setWaterAttack(String waterAttack) {
        this.waterAttack = waterAttack;
    }

    public void setWaterPower(int waterPower) {
        this.waterPower = waterPower;
    }
}


