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

        System.out.println(charmander.getName() + " is level " + charmander.getLevel() + ", can do a " + charmander.getFireAttack() + " that does " + charmander.getFirepower() + "hp damage" );
        System.out.println(squirtle.getName() + " is level " + squirtle.getLevel() + ", can do a " + squirtle.getWaterAttack() + " that does " + squirtle.getWaterPower() + "hp damage" );
        System.out.println(bulbasaur.getName() + " is level " + bulbasaur.getLevel() + ", can do a " + bulbasaur.getGrassAttack() + " that does " + bulbasaur.getGrassPower() + "hp damage" );
        System.out.println(pikachu.getName() + " is level " + pikachu.getLevel() + ", can do a " + pikachu.getElectricAttack() + " that does " + pikachu.getElectricPower() + "hp damage" );
        charmander.fireSpin();
        squirtle.eats();
        bulbasaur.speaks();
        pikachu.spark();
        charmander.setFirepower(30);
        bulbasaur.setGrassAttack("razor leaf");
        System.out.println(charmander.getName() + " is level " + charmander.getLevel() + ", can do a " + charmander.getFireAttack() + " that does " + charmander.getFirepower() + "hp damage" );
        System.out.println(bulbasaur.getName() + " is level " + bulbasaur.getLevel() + ", can do a " + bulbasaur.getGrassAttack() + " that does " + bulbasaur.getGrassPower() + "hp damage" );




    }
}
