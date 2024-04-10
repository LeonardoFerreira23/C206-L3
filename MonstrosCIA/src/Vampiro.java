public class Vampiro extends Monstro{
    private int medidorDeSangue;
    private boolean formaDeMorcego;

    public Vampiro(int idade, int vida, int energia) {
        super(idade, vida, energia);
    }


    public int getMedidorDeSangue()
    {
        return medidorDeSangue;
    }

    public void setMedidorDeSangue(int medidorDeSangue)
    {
        this.medidorDeSangue = medidorDeSangue;
    }

    public boolean isFormaDeMorcego()
    {
        return formaDeMorcego;
    }

    public void setFormaDeMorcego(boolean formaDeMorcego)
    {
        this.formaDeMorcego = formaDeMorcego;
    }


    public void transformar(){
        formaDeMorcego = true;
        this.setVida(getVida()/2);
        this.setEnergia(getEnergia()/2);
        System.out.println("Vampirinho sapeca se transformou!");
        System.out.println("Forma de Morcego");
        System.out.println("Vida: " + getVida() + " Energia: " + getEnergia());
    }
    public void recuperarVida() {
        System.out.println("Vida Recuperada!");
        this.setVida(100);
    }

    public void atacarComMordida(Monstro monstroalvo ){
        System.out.println("Ataque de mordida!");
        System.out.println(this.getClass().getName() + " mordeu " + monstroalvo.getClass().getName());
    }

}
