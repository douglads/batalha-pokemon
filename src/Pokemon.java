
import javax.swing.ImageIcon;

public class Pokemon {
    
    public Pokemon(){ }
    
    public Pokemon(String nome, String tipo, int level){
       this.Nome = nome;
       this.Tipo = tipo.toLowerCase();
       this.Level = level;
       this.calculaAtributos();
       this.calculaBonus();
    }
    
    public Pokemon(String nome, String tipo, String caminhoImagem){
        this.Nome = nome;
        this.Tipo = tipo;
        this.imagem = new ImageIcon(getClass().getResource(caminhoImagem));
        this.calculaAtributos();
    }
    
    private String Nome;
    public String getNome(){
        return Nome;
    }
    private ImageIcon imagem;
    public ImageIcon getImagem(){
        return imagem;
    }
    
    private String Tipo;
    public String getTipo(){
        return Tipo;
    }
    private int Level;
    public void setLevel(int level){
        Level = level;
    }
    private int Vida = 200;
    public int getVida(){
        return Vida;
    }
    
    private int Ataque;
    public int getAtaque(){
        return Ataque;
    }
    private int Defesa;
    public int getDefesa(){
        return Defesa;
    }
    
    public void calculaAtributos(){
        switch (this.Tipo){
            case "fogo":{
                this.Vida -= 20;
                this.Ataque = 60;
                this.Defesa = 20;
                break;
            }
            case "agua":{
                this.Vida -= 5;
                this.Ataque = 40;
                this.Defesa = 35;
                break;
            }
            case "planta":{
                this.Vida += 20;
                this.Ataque = 15;
                this.Defesa = 60;
                break;
            }
            case "pedra":{
                this.Vida += 25;
                this.Ataque = 30;
                this.Defesa = 60;
                break;
            }
        }
    }
    
    public void calculaBonus(){
        this.Vida += this.Level / 2;
        this.Ataque += this.Level / 3;
        this.Defesa += this.Level / 4;
        this.imprimePokemon();
    }
    
    public void imprimePokemon(){
        System.out.println("Pókemon: " + this.Nome);
        System.out.println("Tipo: " + this.Tipo);
        System.out.println("Level: " + this.Level);
        System.out.println("Vida: " + this.Vida);
        System.out.println("Ataque: " + this.Ataque);
        System.out.println("Defesa: " + this.Defesa);
    }
}
