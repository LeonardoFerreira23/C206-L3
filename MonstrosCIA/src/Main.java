// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Criando monstros
        Vampiro VampirinhoSapeca = new Vampiro(739,200,100);
        Zumbi ZumbiAtrapalhado = new Zumbi(3,100,45);
        Bruxa BruxinhaLeiga = new Bruxa(33, 75, 60);

        //Transnformando Vampiro em um morcego
        VampirinhoSapeca.transformar();

        //Aprendendo Feitiços
        BruxinhaLeiga.apenderFeitico("Bolha de sabao", 15);
        BruxinhaLeiga.apenderFeitico("Mini bola de fogo", 30);

        //Listando e esquecendo Feitiços
        BruxinhaLeiga.listarFeiticos();
        BruxinhaLeiga.esquecerFeitico(1);

        //Monstros Atacando
        VampirinhoSapeca.atacarComMordida(ZumbiAtrapalhado);
        ZumbiAtrapalhado.assutar(BruxinhaLeiga);
        BruxinhaLeiga.lancarFeitico(2,ZumbiAtrapalhado);

    }
}