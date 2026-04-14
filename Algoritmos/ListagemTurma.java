import java.util.Scanner;

public class ListagemTurma {
    public static void main(String [] arguments){
        Scanner sc = new Scanner(System.in);
        
        int contador = 0;

        System.out.print("Informe a quantidade de alunos: ");
        int n = sc.nextInt();
        ac.nextLine();
        
        String[] nomes = new String[n];
        double[] notas1 = new double[n];
        double[] notas2 = new double[n];
        double[] medias = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Informe o nome do aluno " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
            System.out.println("Informe a primeira nota: ");
            notas1[i] = sc.nextDouble();
            System.out.println("Informe a segunda nota: ");
            notas2[i] = sc.nextDouble();
            ac.nextLine();
            medias[i] = (notas1[i] + notas2[i])/2;
            if (medias[i] >= 7) {
                contador++;
            }
        }
        System.out.println("Listagem dos alunos");
        for (int j = 0; j < n; j++) {
            System.out.println(nomes[i] + ": " + medias[i]);
        }
        System.out.println(contador + " alunos estão acima da média");

        sc.close();
    }
}
