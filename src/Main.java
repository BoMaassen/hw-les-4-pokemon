import pokemon.pokemon_type.ElectricPokemon;
import pokemon.pokemon_type.FirePokemon;
import pokemon.pokemon_type.GrassPokemon;
import pokemon.pokemon_type.WaterPokemon;

public class Main {
    public static void main(String[] args) {
        FirePokemon charmander = new FirePokemon("Charmander", 5, 20, "Fire spin");
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 10, 40, "Water gun");
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 8, 30, "Vine whip");
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 12, 25, "Thunder shock");

        System.out.println(charmander.getName() + " can do a " + charmander.getFireAttack() + " and is level " + charmander.getLevel() );

    }
}
