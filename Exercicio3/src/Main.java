import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Livro livro = new Livro();
        CD cd = new CD();


        System.out.println("Digite o nome do livro: ");
        livro.setNome(entrada.nextLine());
        System.out.println("Digite o preço do livro: ");
        livro.setPreco(entrada.nextDouble());
        entrada.nextLine();
        System.out.println("Digite o autor do livro: ");
        livro.setAutor(entrada.nextLine());

        System.out.println("\nDados do CD:");
        System.out.print("Nome: ");
        cd.setNome(entrada.nextLine());
        System.out.print("Preço: ");
        cd.setPreco(entrada.nextDouble());
        System.out.print("Número de faixas: ");
        cd.setNumFaixas(entrada.nextInt());

        System.out.println("\nInformações do CD:");
        cd.exibeInformacoes();

        entrada.close();

    }
}