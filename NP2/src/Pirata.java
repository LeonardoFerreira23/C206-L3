public class Pirata {
    private String nome;
    private String comidaFavorita;
    private int poder;



    public void comer(Cozinheiro cozinheiro) {
        if (comidaFavorita == this.comidaFavorita) {
            this.setPoder(this.getPoder() * 2);
            System.out.println(cozinheiro.getNome() + "Prato favorito prepado, poder aumentado 2X");
        }
        else {

        }

    }


    public Pirata lutar(Pirata pirata){

        System.out.println(this.getNome() + " esta lutando com " + pirata.getNome());

        if(this.getPoder() > pirata.getPoder()){
            System.out.println(this.getNome() + " Derrotou " + pirata.getNome());
            System.out.println(this.getNome() + " Poder: " + this.getPoder());
        }else{
            System.out.println(pirata.getNome() + " Derrotou " + this.getNome());
            System.out.println(pirata.getNome() + " Poder: " + pirata.getPoder());
        }

        return pirata;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }

    public void setComidaFavorita(String comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
