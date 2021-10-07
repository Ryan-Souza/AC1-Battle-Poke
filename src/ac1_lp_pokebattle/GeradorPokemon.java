
package ac1_lp_pokebattle;

public class GeradorPokemon {
    
    public static Pokemon gerarPokemon(int idPokemon){
        switch(idPokemon){
        case 1:
		return Pikachu();
	case 2:
		return Charmander();
	case 3:
		return Bulbasaur();
	case 4:
		return Staryu();
	case 5:
		return Geodude();
	default:
		return null;
        }
    }
    //GERANDO OS POKEMONS
    private static Pokemon Pikachu(){
        Pokemon pokemon = new Pokemon("Pikachu", 31, 19, 50, TipoPokemon.ELETRICO);
        String skill01 = Integer.toString(pokemon.ataque + 10);
        String skill02 = Integer.toString(pokemon.ataque + 13);
        pokemon.vantagens[0] = TipoPokemon.AGUA;
        pokemon.skills[0][0] = "Quick Attack";
        pokemon.skills[0][1] = skill01;
        pokemon.skills[1][0] = "Thunder Bolt";
        pokemon.skills[1][1] = skill02;
        
        return pokemon;
    }
    private static Pokemon Charmander(){
        Pokemon pokemon = new Pokemon("Charmander", 37, 24, 39, TipoPokemon.FOGO);
        String skill01 = Integer.toString(pokemon.ataque + 10);
        String skill02 = Integer.toString(pokemon.ataque + 13);
        pokemon.vantagens[0] = TipoPokemon.PLANTA;
        pokemon.skills[0][0] = "Scratch";
        pokemon.skills[0][1] = skill01;
        pokemon.skills[1][0] = "Flamethrower";
        pokemon.skills[1][1] = skill02;
        
        return pokemon;
    }
    private static Pokemon Bulbasaur(){
        Pokemon pokemon = new Pokemon("Bulbasaur", 34, 34, 32, TipoPokemon.PLANTA);
        String skill01 = Integer.toString(pokemon.ataque + 10);
        String skill02 = Integer.toString(pokemon.ataque + 13);
        pokemon.vantagens[0] = TipoPokemon.AGUA;
        pokemon.vantagens[1] = TipoPokemon.PEDRA;
        pokemon.skills[0][0] = "Tackle";
        pokemon.skills[0][1] = skill01;
        pokemon.skills[1][0] = "Vine Whip";
        pokemon.skills[1][1] = skill02;
        
        return pokemon;
    }
    private static Pokemon Staryu(){
        Pokemon pokemon = new Pokemon("Staruy", 36, 15, 49, TipoPokemon.AGUA);
        String skill01 = Integer.toString(pokemon.ataque + 10);
        String skill02 = Integer.toString(pokemon.ataque + 13);
        pokemon.vantagens[0] = TipoPokemon.FOGO;
        pokemon.vantagens[1] = TipoPokemon.PEDRA;
        pokemon.skills[0][0] = "Swift";
        pokemon.skills[0][1] = skill01;
        pokemon.skills[1][0] = "Bubblebeam";
        pokemon.skills[1][1] = skill02;
        
        return pokemon;
    }
    private static Pokemon Geodude(){
        Pokemon pokemon = new Pokemon("Geodude", 34, 34, 32, TipoPokemon.PEDRA);
        String skill01 = Integer.toString(pokemon.ataque + 10);
        String skill02 = Integer.toString(pokemon.ataque + 13);
        pokemon.vantagens[0] = TipoPokemon.ELETRICO;
        pokemon.vantagens[1] = TipoPokemon.FOGO;
        pokemon.skills[0][0] = "Tackle";
        pokemon.skills[0][1] = skill01;
        pokemon.skills[1][0] = "Earth Power";
        pokemon.skills[1][1] = skill02;
        
        return pokemon;
    }
}
