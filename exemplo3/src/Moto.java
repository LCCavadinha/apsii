public class Moto extends Veiculo {
    public int numCilindradas;

    public Moto(String modelo, int ano, int numCilindradas){
        super(modelo,ano);
        this.numCilindradas = numCilindradas;
    }

    @Override
    public String imprimeDetalhes() {
        return super.imprimeDetalhes() + "\nNúmero de Cilindradas: " + this.numCilindradas;
    }
}
