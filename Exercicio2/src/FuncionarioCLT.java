public class FuncionarioCLT extends Funcionario {
    public double valeTransporte;
    public double valeAlimentacao;

    public FuncionarioCLT(String nome, String matricula, double salarioBase, String dataAdmissao, double valeTransporte,
                          double valeAlimentacao) {
        super(nome, matricula, salarioBase, dataAdmissao);
        this.valeTransporte = valeTransporte;
        this.valeAlimentacao = valeAlimentacao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario()  + this.valeTransporte + this.valeAlimentacao;
    }

    @Override
    public String toString() {
        return super.toString() + "|VT: " + this.valeTransporte + "|VA:" + this.valeAlimentacao;
    }
}
