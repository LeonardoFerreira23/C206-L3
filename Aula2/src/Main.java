public class Main {
    public static void main(String[] args) {
        //Steve steve;  Variavel tipo 'Steve'
        Steve steve = new Steve(10, 5); // Criando uma objeto do tipo 'Steve'

        Steve steve2 = new Steve(9, 4);

        //steve.ferramenta = new Ferramenta();

        //Atribuindo valores aos atributos da classe
        steve.armadura = 4;
        steve.xp = 20;


        //Chamando Métodos
        steve.andar();
        //Sobrecarga
        steve.andar(10);
        steve.correr();

        //Imprimindo na tela o atributo vida
        System.out.println(steve.vida);
        System.out.println(steve.toString());
        System.out.println(steve);


        Carro carro1 = new Carro(0,500,true);
        System.out.println(carro1.tipoPneu);
        carro1.correr();
        System.out.println(carro1.motor.potencia);




    }
}