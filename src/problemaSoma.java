import java.util.Scanner;
import java.util.Locale;

public class problemaSoma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = input.nextInt();
        System.out.print("Digite o valor de Y: ");
        int y = input.nextInt();
        input.close();

        int soma = x + y;

        System.out.print("SOMA = " + soma);


    }
}
