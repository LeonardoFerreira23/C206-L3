public class Equipe {
    private Piloto[] pilotos;
    private Carro carro;
    private String nome;

    public Equipe(String nome, int tipoDePneu, int potencia, boolean turbo) {
        this.nome = nome;
        this.carro = new Carro(tipoDePneu, potencia, turbo);
        this.pilotos = new Piloto[4];  // Vetor para armazenar até 4 pilotos
    }

    public boolean adicionarPiloto(Piloto piloto) {
        for (int i = 0; i < pilotos.length; i++) {
            if (pilotos[i] == null) {
                pilotos[i] = piloto;
                return true;
            }
        }
        return false;
    }

    public boolean retirarPiloto(Piloto piloto) {
        for (int i = 0; i < pilotos.length; i++) {
            if (pilotos[i] != null && pilotos[i].equals(piloto)) {
                pilotos[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean trocarPiloto(Piloto piloto) {
        for (Piloto p : pilotos) {
            if (p != null && p.equals(piloto)) {
                return carro.trocarPiloto(piloto);
            }
        }
        return false;
    }

    public boolean trocarPneu(int tipoDePneu) {
        return carro.trocarPneu(tipoDePneu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Equipe{" +
                "nome='" + nome + '\'' +
                ", carro=" + carro +
                ", pilotos=[");
        for (Piloto p : pilotos) {
            if (p != null) {
                sb.append(p.toString()).append(", ");
            }
        }
        sb.append("]}");
        return sb.toString();
    }
}
