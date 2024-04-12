// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Declaração dos objetos
        Robo robo01 = new Robo(0,"Fred",100);
        Robo robo02 = new Robo(100, "Nicolas", 100);
        BracoArticulado braco01 = new BracoArticulado();
        Garra garra01 = new Garra();
        Camera cam01 = new Camera();
        Empilhador emp01 = new Empilhador();


        //Chamada do metodo trabalhar que reduz a energia do robo em 10
        robo01.trabalhar();

        //Troca de energia entre dois robos
        robo01.trocarEnergia(robo02);

        //Recargar de energia de um robo
        robo01.recarregar(11);

        braco01.setNumeroDeArticulacoes(5);
        braco01.setGarra();

        braco01.trabalhar();

        emp01.adicionarPacote(10);
        emp01.adicionarPacote(10);
        emp01.adicionarPacote(10);

        emp01.mostraPacotes();

    }
}