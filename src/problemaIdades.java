import java.util.Scanner;
import java.util.Locale;

public class problemaIdades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Dados da primeira pessoa: ");
        System.out.print("Nome: ");
        String nome1 = input.nextLine();
        System.out.print("Idade: ");
        double idade1 = input.nextDouble();
        System.out.println("Dados da segunda pessoa: ");
        input.nextLine();
        System.out.print("Nome: ");
        String nome2 = input.nextLine();
        System.out.print("Idade: ");
        double idade2 = input.nextDouble();
        input.close();

        double idadeMedia = (idade1 + idade2) / 2;

        System.out.printf("A idade média de " + nome1 + " e " + nome2 + " é de " + idadeMedia);


    }
}
