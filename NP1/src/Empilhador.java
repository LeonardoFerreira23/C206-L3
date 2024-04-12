public class Empilhador {
    private Pacote[] pacotes = new Pacote[10];

    private int pesoMaximo;


    public boolean adicionarPacote(int peso) {
        for(int i = 0; i < pacotes.length; i++){
            if (pacotes[i] == null){
                pacotes[i] = new Pacote(peso);
                return true;
            }

        }
        return false;
    }

    public void removePacote(int posicao) {
        if(pacotes[posicao] != null){

            }

    }

    public void mostraPacotes(){
        for(int i = 0; i < pacotes.length; i++){
            if (pacotes[i] != null) {
                System.out.println(pacotes[i]);
            }
        }
    }


    public Pacote[] getPacotes() {
        return pacotes;
    }

    public void setPacotes(Pacote[] pacotes) {
        this.pacotes = pacotes;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }
}
