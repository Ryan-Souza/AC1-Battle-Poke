package ac1_lp_pokebattle;

import java.util.Scanner;
import java.util.Random;

public class AC1_LP_PokeBattle {
    //Escolhendo pokemon usuario
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int escolhaPokemon;
        
        Pokemon pokemonPc = GeradorPokemon.gerarPokemon(escolhaPokemonPc());
        System.out.println("Pokemon escolhido pela maquina: " + pokemonPc.nome);
        System.out.println("");
        
        //Escolhendo pokemon usuario
        System.out.println("Escolha seu pokemon:");
        System.out.println("1 - Pikachu");
        System.out.println("2 - Charmander");
        System.out.println("3 - Bulbasaur");
        System.out.println("4 - Staryu");
        System.out.println("5 - Geodude");
        escolhaPokemon = ler.nextInt();
        System.out.println("");
    
        Pokemon pokemonUser = GeradorPokemon.gerarPokemon(escolhaPokemon);
        System.out.println("Voce escolheu o pokemon " + pokemonUser.nome);
        System.out.println("");
        System.out.println("A batalha ira começar...");
        System.out.println("");
        System.out.println("");
        
        Batalha batalha = new Batalha(pokemonUser, pokemonPc);
        batalha.Start();
        System.out.println("");
    }
    
    static int escolhaPokemonPc(){          //Escolhendo pokemon do Computador
        Random gerador = new Random();
        return gerador.nextInt(5)+1;
        
    }
}
