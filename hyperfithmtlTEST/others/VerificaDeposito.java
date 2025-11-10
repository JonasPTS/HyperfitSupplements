import java.util.Scanner;

public class VerificaDeposito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine().trim();

        System.out.print("Digite o valor do depósito: ");
        String entrada = sc.nextLine()
                .replace("R$", "")
                .replace(" ", "")
                .replace(",", ".")
                .trim();

        double deposito;
        try {
            deposito = Double.parseDouble(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido. Digite apenas números (ex.: 150.75 ou 150,75).");
            return;
        }

        if (deposito < 0) {
            System.out.println("Depósito não pode ser negativo.");
            return;
        }else if (deposito > 1000) {
            System.out.println("Olá " + nome + ", seu depósito é maior que 1000.");
        } else {
            System.out.println("Olá " + nome + ", seu depósito não é maior que 1000.");
        }
    }
}
