public class Zumbi extends Monstro{
    private int numeroDeCerebrosComidos;

    public Zumbi(int idade, int vida, int energia) {
        super(idade, vida, energia);
    }


    public int getNumeroDeCerebrosComidos() {
        return numeroDeCerebrosComidos;
    }


    public void setNumeroDeCerebrosComidos(int numeroDeCerebrosComidos) {
        this.numeroDeCerebrosComidos = numeroDeCerebrosComidos;
    }

    public void atacarComMordida(Monstro monstroAlvo){
        System.out.println(this.getClass().getName() + " mordeu o cerebro " + monstroAlvo.getClass().getName());
    }
}
