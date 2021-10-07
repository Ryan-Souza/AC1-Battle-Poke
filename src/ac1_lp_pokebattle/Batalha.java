
package ac1_lp_pokebattle;

import java.util.Scanner;
import java.util.Random;

public class Batalha {
    
    public Pokemon pokemonUsuario;
    public Pokemon pokemonMaquina;
    
    public Batalha(Pokemon pokemonUser, Pokemon pokemonPc){
        pokemonUsuario = pokemonUser;
        pokemonMaquina = pokemonPc;
    }
    public void Start(){
        Scanner ler = new Scanner(System.in);
        
        boolean vezUser;
        //Quem Joga Primeiro?
        if(pokemonUsuario.velocidade >= pokemonMaquina.velocidade){
            vezUser = true;
        } else {
            vezUser = false;
        }
        
        //Enquanto batalhaTerminou for diferente de verdade faça
        while(batalhaTerminou() != true){
            if(vezUser){
                System.out.println("Escolha Seu Ataque: "); //IMPRIMINDO ATAQUES DO USUARIO
                for (int i = 0; i < 2 ; i++) {
                    for (int j = 0; j < 1; j++) {
                        System.out.println((i+1) + " - " + pokemonUsuario.getSkills()[i][j]);
                    }
                }
                int skillSelecionada = Integer.parseInt(ler.next()) -1;
                if (skillSelecionada == 0){ //VERIFICANDO SE FOI A PRIMEIRA SKILL
                    pokemonMaquina.vida -= (bonusPokeUser() + Integer.parseInt(pokemonUsuario.getSkills()[0][1]));
                    System.out.println("");
                    System.out.println(pokemonUsuario.nome + " utilizou o ataque " + pokemonUsuario.getSkills()[0][0]);
                    System.out.println(pokemonMaquina.nome + " perdeu " + (bonusPokeUser() + Integer.parseInt(pokemonUsuario.getSkills()[0][1])) + " de vida.");
                    System.out.println("Restande de vida do seu Pokemon: " + pokemonUsuario.vida);
                    System.out.println("Restande de vida do Pokemon do oponente: " + pokemonMaquina.vida);
                } else {                    //VERIFICANDO SE FOI A SEGUNDA SKILL
                    pokemonMaquina.vida -= (bonusPokeUser() + Integer.parseInt(pokemonUsuario.getSkills()[1][1]));
                    System.out.println("");
                    System.out.println(pokemonUsuario.nome + " utilizou o ataque " + pokemonUsuario.getSkills()[1][0]);
                    System.out.println(pokemonMaquina.nome + " perdeu " + (bonusPokeUser() + Integer.parseInt(pokemonUsuario.getSkills()[1][1])) + " de vida.");
                    System.out.println("Restande de vida do seu Pokemon: " + pokemonUsuario.vida);
                    System.out.println("Restande de vida do Pokemon do oponente: " + pokemonMaquina.vida);
                }
                vezUser = false;
                System.out.println("");
            }
            else{
                int skillPc = escolhaSkillPc();
                if(skillPc == 0){           //VERIFICANDO SE FOI A PRIMEIRA SKILL
/*CALCULO DE DANO*/ pokemonUsuario.vida -= (bonusPokePc() + Integer.parseInt(pokemonMaquina.getSkills()[0][1]));
                    System.out.println("");
                    System.out.println(pokemonMaquina.nome + " utilizou o ataque " + pokemonMaquina.getSkills()[0][0]);
                    System.out.println(pokemonUsuario.nome + " perdeu " + (bonusPokePc() +Integer.parseInt(pokemonMaquina.getSkills()[0][1])) + " de vida.");
                    System.out.println("Restande de vida do seu Pokemon: " + pokemonUsuario.vida);
                    System.out.println("Restande de vida do Pokemon do oponente: " + pokemonMaquina.vida);
                } else{                     //VERIFICANDO SE FOI A SEGUNDA SKILL
/*CALCULO DE DANO*/ pokemonUsuario.vida -= (bonusPokePc() + Integer.parseInt(pokemonMaquina.getSkills()[1][1]));
                    System.out.println("");
                    System.out.println(pokemonMaquina.nome + " utilizou o ataque " + pokemonMaquina.getSkills()[1][0]);
                    System.out.println(pokemonUsuario.nome + " perdeu " + (bonusPokePc() + Integer.parseInt(pokemonMaquina.getSkills()[1][1])) + " de vida.");
                    System.out.println("Restande de vida do seu Pokemon: " + pokemonUsuario.vida);
                    System.out.println("Restande de vida do Pokemon do oponente: " + pokemonMaquina.vida);
                }
                vezUser = true;
            }
            System.out.println("");
        }
        //IMPRIMINDO QUEM VENCEU
        System.out.println("");
        System.out.println("");
        if (pokemonUsuario.vida <= 0){
            System.out.println("O " + pokemonMaquina.nome + " derrotou o " + pokemonUsuario.nome);
        } else {
            System.out.println("O " + pokemonUsuario.nome + " derrotou o " + pokemonMaquina.nome);
        }
    }
    public boolean batalhaTerminou(){   //FUNCAO PRA BATALHA TERMINAR
        return pokemonUsuario.vida <= 0 || pokemonMaquina.vida <= 0;
    }
    static int escolhaSkillPc(){        //FUNCAO PRO PC ESCOLHER SKILL
        Random gerador = new Random();
        return gerador.nextInt(2);
    }
    public int bonusPokeUser(){         //FUNCAO PRO ATAQUE DO USARIO RECEBER BONUS OU NAO
        int bonus = 0;
        if((pokemonUsuario.getVantagens()[0] == pokemonMaquina.getTipo())|| (pokemonUsuario.getVantagens()[1] == pokemonMaquina.getTipo()))
        {
            bonus = 40;
        }
        return bonus;
    }
    public int bonusPokePc(){           //FUNCAO PRO ATAQUE DO PC RECEBER BONUS OU NAO
        int bonus = 0;
        if((pokemonMaquina.getVantagens()[0] == pokemonUsuario.getTipo())|| (pokemonMaquina.getVantagens()[1] == pokemonUsuario.getTipo()))
        {
            bonus = 40;
        }
        return bonus;
    }
    
}
