public class Batalha{

    Pokemon MeuPokemon = new Pokemon();
    Pokemon OutroPokemon = new Pokemon();
    private int campeao;


    public void setMeuPokemonBatalha(int idMeuPokemon) {
        MeuPokemon.setIdMeuPokemon(idMeuPokemon);
    }

    public void setOutroPokemonBatalha(int idOutroPokemon) {
        OutroPokemon.setIdOutroPokemon(idOutroPokemon);
    }

    public int getCampeao() {
        int vitoriasMeuPokemon = 0;
        int vitoriasOutroPokemon = 0;

        if (this.MeuPokemon.getVida() < this.OutroPokemon.getVida()) {
            vitoriasOutroPokemon += 1;
        } else if (this.MeuPokemon.getVida() > this.OutroPokemon.getVida()) {
            vitoriasMeuPokemon += 1;
        }

        if (this.MeuPokemon.getAtaque() < this.OutroPokemon.getAtaque()) {
            vitoriasOutroPokemon += 1;
        } else if (this.MeuPokemon.getAtaque() > this.OutroPokemon.getAtaque()) {
            vitoriasMeuPokemon += 1;
        }

        if (this.MeuPokemon.getDefesa() < this.OutroPokemon.getDefesa()) {
            vitoriasOutroPokemon += 1;
        } else if (this.MeuPokemon.getDefesa() > this.OutroPokemon.getDefesa()) {
            vitoriasMeuPokemon += 1;
        }

        if (vitoriasMeuPokemon == 0 && vitoriasOutroPokemon == 0) {
            this.campeao = 0;
        } else if (vitoriasMeuPokemon > vitoriasOutroPokemon) {
            this.campeao = 1;
        } else {
            this.campeao = 2;
        }
        return this.campeao;
    }

}
