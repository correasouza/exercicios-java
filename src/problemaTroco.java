import java.util.Scanner;
import java.util.Locale;

public class problemaTroco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double precoUnitario = input.nextDouble();
        System.out.print("Quantidade comprada: ");
        int quantidadeComprada = input.nextInt();
        System.out.print("Dinheiro recebido: ");
        double dinheiroRecebido = input.nextDouble();
        input.close();

        double custoTotal = precoUnitario * quantidadeComprada;
        double troco = dinheiroRecebido - custoTotal;

        if (dinheiroRecebido >= custoTotal){
            System.out.printf("TROCO = %.2f", troco);
        } else {
            System.out.print("Dinheiro insuficiente!!!");
        }

    }
}
