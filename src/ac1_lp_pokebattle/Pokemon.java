package ac1_lp_pokebattle;

public class Pokemon {
    //Atributos
    
    public String nome;
    public int vida;
    public int ataque;
    public int defesa;
    public int velocidade;
    public TipoPokemon tipo;
    public TipoPokemon vantagens[] = new TipoPokemon[2];
    public String skills[][] = new String[2][2]; //(linha 0 skill 1) e (linha 1 skill 2)
    
    //Construtor
    public Pokemon(String nome, int ataque, int defesa, int velocidade, TipoPokemon tipo) {
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.tipo = tipo;
        this.vida = 200;
        this.vantagens[0] = vantagens[0];
        this.vantagens[1] = vantagens[1];
        this.skills[0][0] = skills[0][0];
        this.skills[0][1] = skills[0][1];
        this.skills[1][0] = skills[1][0];
        this.skills[1][1] = skills[1][1];
    }
    
    //Funcoes ou Metodos
    
    
    /*public void adicionarSkills (String nome, int dano){
        skills.add (new Skill (nome, dano));
    }
    public void adicionarVantagens (TipoPokemon TipoComDesvantagem, int bonus){
        vantagens.add(new Vantagem (tipo, TipoComDesvantagem, bonus));
    }*/
    /*public int AplicarDano(int skillSelecionada, TipoPokemon tipoPokemonOponente){
        
        Skill skill = skill.getSkills().get(skillSelecionada);
        int dano = skill.dano;
        
        foreach(Vantagem vantagem in Vantagens)
	{
            if (vantagens.TipoComDesvantagem == tipoPokemonOponente)
            {
		dano += vantagens.bonus;
            }
	}
    }*/
            
    //GET AND SET

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }

    public void setTipo(TipoPokemon tipo) {
        this.tipo = tipo;
    }

    public TipoPokemon[] getVantagens() {
        return vantagens;
    }

    public void setVantagens(TipoPokemon[] vantagens) {
        this.vantagens = vantagens;
    }

    public String[][] getSkills() {
        return skills;
    }

    public void setSkills(String[][] skills) {
        this.skills = skills;
    }
    
}



