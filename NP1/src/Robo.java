public class Robo {
    private int energia;
    private String nome;
    private static int totalDeRobos = 0;
    private int energiaMaxima;


    public void trabalhar(){
        System.out.println(this.getNome() + " está trabalhando!");
        this.setEnergia(this.getEnergia() - 10);//Reduz a energia do robo em 10
    }

    public void trocarEnergia(Robo roboAlvo){
        if(roboAlvo.getEnergia() > 0){
            this.setEnergia(roboAlvo.getEnergia() - 10);
            roboAlvo.setEnergia(10);
            System.out.println("Troca de energia entre " + this.getNome() + " e " + roboAlvo.getNome() + " completa!");
        }else{
            System.out.println(roboAlvo.getNome() + "está sem energia para a troca!");
        }
    }

    public void recarregar(int horas){
        this.setEnergia(horas*10);
        if(this.getEnergia() > this.getEnergiaMaxima()){
            System.out.println("Maximo de energia atingido!");
            this.setEnergia(100);
        }
    }


    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getTotalDeRobos() {
        return totalDeRobos;
    }

    public static void setTotalDeRobos(int totalDeRobos) {
        Robo.totalDeRobos = totalDeRobos;
    }

    public int getEnergiaMaxima() {
        return energiaMaxima;
    }

    public void setEnergiaMaxima(int energiaMaxima) {
        this.energiaMaxima = energiaMaxima;
    }

    public Robo(int energia, String nome, int energiaMaxima) {
        this.energia = energia;
        this.nome = nome;
        this.energiaMaxima = energiaMaxima;
        totalDeRobos++;
    }
}
