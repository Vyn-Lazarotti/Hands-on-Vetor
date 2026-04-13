import java.util.Scanner;

public class Primo {
    public static void main(String [] arguments){
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10]; // Guarda 10 números. Valor não pode ser alterado

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um número inteiro: ");
            num[i] = sc.nextInt();
            
        }

        sc.close();
    }
}
