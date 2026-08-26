//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Fusca", 1970);
        System.out.println(veiculo1.imprimeDetalhes());

        Carro Carro1 = new Carro("Gol", 2000, 4);
        System.out.println(Carro1.imprimeDetalhes());

        Moto Moto1 = new Moto("Honda", 2020, 600);
        System.out.println(Moto1.imprimeDetalhes());
    }
}