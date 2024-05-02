public class Main {
    public static void main(String[] args) {
        Equipe equipe = new Equipe("INTL RACER", 3, 500, true);
        Piloto piloto1 = new Piloto("Henrique Bizonho", 28, "Brasileiro");
        Piloto piloto2 = new Piloto("Leo Baiano", 24, "Brasileiro");

        equipe.adicionarPiloto(piloto1);
        equipe.adicionarPiloto(piloto2);
        equipe.trocarPiloto(piloto1);
        equipe.trocarPneu(5);

        System.out.println(equipe);
    }
}
