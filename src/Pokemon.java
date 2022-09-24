    public class Pokemon {
    public String listPokemon[] = new String[]{
        "Cyndaquil", "Charmander", "Growlithe", "Flareon", "Squirtle", "Staryu", "Chikorita", "Turtwig", " Graveler" ,"Sudowoodo"
    };
    public String listPokemonTipos[] = new String[]{
        "fogo", "fogo", "fogo", "fogo", "agua", "agua", "planta", "planta", " pedra" ,"pedra" 
    };
    public Pokemon(){
        
    }
    
    private int idMeuPokemon;

    
    public void setIdMeuPokemon(int idMeuPokemon){
        this.idMeuPokemon = idMeuPokemon;
    }
    public int getIdMeuPokemon(){
        return idMeuPokemon;
    }
    
    private int idOutroPokemon;
    
    public void setIdOutroPokemon(int idOutroPokemon){
        this.idOutroPokemon = idOutroPokemon;
    }
    public int getIdOutroPokemon(){
        return idOutroPokemon;
    }
    
    private String Nome;
    public String getNome(){
        return Nome;
    }

    private String Tipo;
    private int Level;
    private int Vida = 200;
    public int getVida(){
        return Vida;
    }
    
    private int ataque;
    public int getAtaque(){
        return ataque;
    }
    private int defesa;
    public int getDefesa(){
        return defesa;
    }
    
    public Pokemon(int idMeuPokemon ,int idOutroPokemon ,String nome, String tipo, int level){
       this.idMeuPokemon = idMeuPokemon;
       this.idOutroPokemon = idOutroPokemon;
       this.Nome = nome;
       this.Tipo = tipo.toLowerCase();
       this.Level = level;
       this.calculaAtributos();
       this.calculaBonus();
    }
    
    public void calculaAtributos(){
        switch (this.Tipo){
            case "fogo":{
                this.Vida -= 20;
                this.ataque = 60;
                this.defesa = 20;
                break;
            }
            case "água":{
                this.Vida -= 5;
                this.ataque = 40;
                this.defesa = 35;
                break;
            }
            case "planta":{
                this.Vida += 20;
                this.ataque = 15;
                this.defesa = 60;
                break;
            }
            case "pedra":{
                this.Vida += 25;
                this.ataque = 30;
                this.defesa = 60;
                break;
            }
        }
    }
    
    public void calculaBonus(){
        this.Vida = this.Level / 2;
        this.ataque = this.Level / 3;
        this.defesa = this.Level / 4;
    }
    
    public void imprimePokemon(){
        System.out.println("Pókemon: " + this.Nome);
        System.out.println("Tipo: " + this.Tipo);
        System.out.println("Level: " + this.Level);
        System.out.println("Vida: " + this.Vida);
        System.out.println("Ataque: " + this.ataque);
        System.out.println("Defesa: " + this.defesa);
    }
}
