//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GerenteDeFiguras gerente = new GerenteDeFiguras();

        Triangulo t1 = new Triangulo(2.0, 3.0);
        gerente.adicionaFigura(t1);

        Losango l1 = new Losango(4.0, 6.0);
        Losango l2 = new Losango(5.0, 8.0);
        gerente.adicionaFigura(l1);
        gerente.adicionaFigura(l2);

        System.out.println("Figuras cadastradas:");
        gerente.imprimeFiguras();

        double areaTotal = gerente.calculaAreaTotalDeFiguras();
        System.out.println("Área total: " + areaTotal);
    }
}