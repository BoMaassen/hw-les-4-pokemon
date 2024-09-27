package pokemon.pokemon_type;

import pokemon.Pokemon;

public class GrassPokemon extends Pokemon {
    private int grassPower;
    private String grassAttack;

    public GrassPokemon(String name, int level, int grassPower, String grassAttack) {
        super(name, level);
        this.grassPower = grassPower;
        this.grassAttack = grassAttack;
    }

    public void vineWhip() {
        System.out.println("Pokemon attacked with vine whip");
    }

    public void razorLeaf() {
        System.out.println("Pokemon attacked razor leaf");
    }

    public void eats() {
        System.out.println("Grass pokemon eats");
    }

    public int getGrassPower() {
        return this.grassPower;
    }

    public String getGrassAttack() {
        return this.grassAttack;
    }

    public void setGrassAttack(String grassAttack) {
        this.grassAttack = grassAttack;
    }

    public void setGrassPower(int grassPower) {
        this.grassPower= grassPower;
    }
}




