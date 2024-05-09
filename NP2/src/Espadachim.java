public class Espadachim extends Pirata implements Comandar{
    private String nomeDaEspada;

    public String getNomeDaEspada() {
        return nomeDaEspada;
    }

    public void setNomeDaEspada(String nomeDaEspada) {
        this.nomeDaEspada = nomeDaEspada;
    }

    @Override
    public void darOrdens() {
        System.out.println("O imediato está ordenando os tripulantes");
    }

    @Override
    public void mudarRota() {
        System.out.println("O imediato está mudando a rota");
    }

    public Espadachim(String nomeDaEspada) {
        this.nomeDaEspada = nomeDaEspada;
    }
}
