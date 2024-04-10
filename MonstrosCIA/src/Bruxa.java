public class Bruxa extends Monstro {

    private Feitico[] feiticos = new Feitico[10];

    public Bruxa(int idade, int vida, int energia) {
        super(idade, vida, energia);
    }

    public boolean apenderFeitico(String nome, int poder) {
        for(int i = 0; i < feiticos.length; i++){
            if (feiticos[i] == null){
                feiticos[i] = new Feitico(nome, poder);
                return true;
            }

        }
        return false;
    }

    public void listarFeiticos () {
        System.out.println("Lista de Feitiços");
        System.out.println("------------------");
        for (int i = 0; i < feiticos.length; i++) {
            if (feiticos[i] != null) {
                System.out.println(feiticos[i].getNome() + " - Poder: " + feiticos[i].getPoder());
            }
        }
        System.out.println("------------------");
    }
    public void esquecerFeitico (int posicao) {
        if (posicao >= 1 && posicao <= feiticos.length) {
            feiticos[posicao - 1] = null;
            System.out.println("Feitiço esquecido com sucesso!");
        } else {
            System.out.println("Ops! feitiço invalido");
        }
    }

    public void lancarFeitico (int posicao, Monstro monstroAlvo) {
        if (posicao >= 1 && posicao <= feiticos.length) {
            System.out.println(this.feiticos[posicao - 1].getNome() + " lançado em " + monstroAlvo.getClass().getName());
        } else {
            System.out.println("ERRO");
        }



    }

}
