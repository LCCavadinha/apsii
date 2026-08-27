//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Luiz", "1", 3000.00, "01/01/2020");
        System.out.println(funcionario1);

        FuncionarioCLT funcinarioCLT1 = new FuncionarioCLT("João", "2", 3000.00, "01/01/2020", 200.00, 300.00);
        System.out.println(funcinarioCLT1);

    }
}