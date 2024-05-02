public class Carro {
    private Motor motor;
    private Piloto pilotoAtual;
    private int tipoDePneu;

    public Carro(int tipoDePneu, int potencia, boolean turbo) {
        this.tipoDePneu = tipoDePneu;
        this.motor = new Motor(potencia, turbo);
    }

    public boolean trocarPiloto(Piloto novoPiloto) {
        if (novoPiloto != null) {
            this.pilotoAtual = novoPiloto;
            return true;
        }
        return false;
    }

    public boolean trocarPneu(int novoTipo) {
        if (novoTipo >= 1 && novoTipo <= 5) {
            this.tipoDePneu = novoTipo;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "motor=" + motor +
                ", pilotoAtual=" + pilotoAtual +
                ", tipoDePneu=" + tipoDePneu +
                '}';
    }
}