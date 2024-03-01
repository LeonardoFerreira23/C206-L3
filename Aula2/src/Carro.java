public class Carro {
    public Motor motor;

    public int tipoPneu;


    public void correr(){
        System.out.println("O carro está correndo!");
    }

    public Carro(int tipoPneu, int potencia, boolean turbo){
        this.tipoPneu = tipoPneu;
        this.motor = new Motor(potencia,turbo);
    }
}
