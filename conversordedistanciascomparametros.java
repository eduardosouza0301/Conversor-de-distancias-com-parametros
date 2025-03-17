import java.util.Scanner;

public class Projetoconversordistanciascomparametros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de conversão:");
        System.out.println("1: Converter de metros para quilômetros.");
        System.out.println("2: Converter de quilômetros para metros.");

        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Informe a distância em metros: ");
            double metros = scanner.nextDouble();
            double quilometros = converterMparaK(metros);
            System.out.println("A distância de " + metros + " metros é igual a " + quilometros + " quilômetros.");
        } else if (escolha == 2) {
            System.out.println("Informe a distância em quilômetros: ");
            double quilometros = scanner.nextDouble();
            double metros = converterKparaM(quilometros);
            System.out.println("A distância de " + quilometros + " quilômetros é igual a " + metros + " metros.");
        } else {
            System.out.println("Opção inválida");
        }

        scanner.close();
    }

    public static double converterMparaK(double metros) {
        return metros / 1000;
    }

    public static double converterKparaM(double quilometros) {
        return quilometros * 1000;
    }
}