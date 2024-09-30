package pokemon.pokemon_type;

import pokemon.Pokemon;

public class ElectricPokemon extends Pokemon {
    private int electricPower;
    private String electricAttack;

    public ElectricPokemon(String name, int level, int electricPower, String electricAttack) {
        super(name, level);
        this.electricPower = electricPower;
        this.electricAttack = electricAttack;
    }

    public void thunderShock() {
        System.out.println("Pokemon attacked with thunder shock");
    }

    public void spark() {
        System.out.println("Pokemon attacked with spark");
    }

    public void eats() {
        System.out.println("Electric pokemon eats");
    }

    public int getElectricPower() {
        return this.electricPower;
    }

    public String getElectricAttack() {
        return this.electricAttack;
    }

    public void setElectricAttack(String electricAttack) {
        this.electricAttack = electricAttack;
    }

    public void setElectricPower(int electricPower) {
        this.electricPower = electricPower;
    }
}