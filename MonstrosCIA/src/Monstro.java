public class Monstro {
    private int idade;
    private int vida;
    private int energia;


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void assutar(Monstro monstroAlvo){
        System.out.println(this.getClass().getName() + " assustou " + monstroAlvo.getClass().getName() );
        monstroAlvo.setEnergia(getEnergia()/2);
    }


    @Override
    public String toString() {
        return "Monstro{" +
                "idade=" + idade +
                ", vida=" + vida +
                ", energia=" + energia +
                '}';
    }


    public Monstro(int idade, int vida, int energia) {
        this.idade = idade;
        this.vida = vida;
        this.energia = energia;
    }
}
