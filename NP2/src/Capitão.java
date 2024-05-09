public class Capitão extends Pirata implements Comandar{

    private static int numeroDeSeguidores = 1;


    public void conquistarNovoSeguidor(Pirata pirata){
        if(pirata.getPoder() <= this.getPoder()){
            System.out.println("Novo pirata recrutado!");
            numeroDeSeguidores++;
            System.out.println("Tripulação Total: " + numeroDeSeguidores);
        }else{
            System.out.println("O pirata não pode ser juntar a tripulação!");
        }
    }

    public static int getNumeroDeSeguidores() {
        return numeroDeSeguidores;
    }

    public static void setNumeroDeSeguidores(int numeroDeSeguidores) {
        Capitão.numeroDeSeguidores = numeroDeSeguidores;
    }

    @Override
    public void darOrdens() {
        System.out.println("O capitão está ordenando " + numeroDeSeguidores + " tripulantes");
    }

    @Override
    public void mudarRota() {
        System.out.println("O capitão está mudando a rota");
    }
}
