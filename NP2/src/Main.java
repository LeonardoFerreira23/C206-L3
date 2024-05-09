//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Declaração de objetos
        Pirata pirata01 = new Pirata();
        Pirata pirata02 = new Capitão();
        Pirata pirata03 = new Cozinheiro();
        Pirata pirata04 = new Espadachim("Cimitara");
        Pirata pirata05 = new Pirata();

        pirata01.setNome("Alfredo");
        pirata01.setPoder(20);

        pirata02.setNome("Rogério");
        pirata02.setPoder(30);
        pirata02.setComidaFavorita("Tilapia");

        pirata03.setNome("Ricardo");
        pirata03.setPoder(15);

        pirata04.setNome("Cleiton");
        pirata04.setPoder(25);

        pirata05.setNome("Robson");
        pirata05.setPoder(15);


        //Recrutando novos tripulantes
        ((Capitão) pirata02).conquistarNovoSeguidor(pirata01);
        ((Capitão) pirata02).conquistarNovoSeguidor(pirata03);
        ((Capitão) pirata02).conquistarNovoSeguidor(pirata04);
        ((Capitão) pirata02).conquistarNovoSeguidor(pirata05);

        //Capitão dando ordens
        ((Capitão) pirata02).darOrdens();
        ((Capitão) pirata02).mudarRota();

        //Imediato dando ordens
        ((Espadachim)pirata04).darOrdens();
        ((Espadachim)pirata04).mudarRota();

        //Piratas lutando
        pirata02.lutar(pirata01);
        pirata01.lutar(pirata05);
        pirata03.lutar(pirata05);
    }
}
