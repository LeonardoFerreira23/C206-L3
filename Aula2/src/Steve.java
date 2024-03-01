public class Steve {
    public int vida;
    public int fome;
    public int armadura;
    public int xp;

    //Composição fortemente ligado
    public Ferramenta ferramentaAtual = new Ferramenta();


    public void correr(){
        System.out.println("Steve está correndo!");
    }

    public void andar(){
        System.out.println("Steve está andando!");
    }

    public void andar(int n){
        System.out.println("Steve está andando muito rapido!");
    }

    //Fracamante ligado
    //public void addFerramenta(Ferramenta ferramenta){
    //    this.ferramentaAtual = ferramenta;
    //}

    //Exemplo de toString!
    public String toString(){
        //ferramentaAtual = new Ferramenta();
        return this.vida + " Vida Total "+
                this.fome + " Fome Total "+
                this.armadura + " Armadura total "+
                this.xp + " XP total ";
    }


    //Construtor
    Steve(int vida, int fome){
        this.vida = vida;
        this.fome = fome;
        System.out.println("Novo Steve criado!");
    }
}
