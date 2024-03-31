import java.util.Scanner;
import java.util.Locale;

public class problemaPagamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Valor por hora: ");
        double valorPorHora = input.nextDouble();
        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = input.nextInt();
        input.close();

        double pagamento = valorPorHora * horasTrabalhadas;

        System.out.printf("O pagamento para " + nome + " deve ser %.2f", pagamento);

    }
}
