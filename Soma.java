import java.util.*;;
public class Soma {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int num1 = sc.nextInt();
        System.out.println("Entre com outro número: ");
        int num2 = sc.nextInt();
        int soma = num1 + num2;
        System.out.printf("o resultado da soma é: "+soma);

    }
}
