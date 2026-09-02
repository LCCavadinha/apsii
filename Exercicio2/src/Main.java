
public class Main {
    public static void main(String[] args) {

        System.out.println("Funcionario:");
        Funcionario funcionario1 = new Funcionario("Luiz", "1", 3000.00, "01/01/2020");
        System.out.println(funcionario1);

        System.out.println("FuncionarioCLT:");
        FuncionarioCLT funcinarioCLT1 = new FuncionarioCLT("João", "2", 3000.00, "01/01/2020", 200.00, 300.00);
        System.out.println(funcinarioCLT1);

        System.out.println("Gerente:");
        Gerente gerente1 = new Gerente("Carla Mendes", "3", 8000, "15/01/2018", 300, 500, 12, 0.20);
        System.out.println(gerente1);

        System.out.println("Estagiário:");
        Estagiario estagiario1 = new Estagiario("Pedro", "4", 1500.00, "01/02/2023", 1000.00, 20);
        System.out.println(estagiario1);

        System.out.println("Diretor:");
        Diretor diretor1 = new Diretor("Ana", "5", 15000.00, "01/01/2015", 500.00, 1000.00, 20, 0.30, 2000.00);
        System.out.println(diretor1);
    }
}