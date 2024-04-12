public class BracoArticulado {
    private int numeroDeArticulacoes;
    private Garra garra;
    private Camera camera;

    public void trabalhar(){
        if(this.camera != null ){
            System.out.println("Braço Articulado, está em operação!");
            this.garra.agarrarPeca(); // função agarrarPeca com a varivel posicao, pois a camera foi encontrada
        }else{
            System.out.println("Câmera não encontrada!");
            //this.garra.agarrarPeca(); // função agarrarPeca sem a varivel posicao, pois a camera nao foi encontrada
        }
    }

    public int getNumeroDeArticulacoes() {
        return numeroDeArticulacoes;
    }

    public void setNumeroDeArticulacoes(int numeroDeArticulacoes) {
        this.numeroDeArticulacoes = numeroDeArticulacoes;
    }

    public Garra getGarra() {
        return garra;
    }

    public void setGarra() {
        this.garra = garra;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
}
