import java.util.Scanner;

public class VectorHand {
    public static void main(String [] arguments){
        Scanner sc = new Scanner(System.in);

        int op;

        do {

            System.out.println("MENU");
            System.out.println("Escolha uma opção: \n[0] Sair\n[1] Vetores intercalados\n[2] Vetores positivos e negativos\n[3] Primos\n[4] Pares e ímpares");
            op = sc.nextInt();

            switch(op) {

                case 1:
                    int n = 10;
                    int[] vetor1 = new int[n];
                    int[] vetor2 = new int[n];
                    int[] vetor3 = new int[n + 2];
                    System.out.println("Vetor 1");
                    for(int i = 0; i < n; i++){
                        System.out.println("Informe apenas números inteiros");
                        System.out.println("Digite o número " + (i+1) + " do vetor 1");
                        vetor1[i] = sc.nextInt();
                        System.out.println("Digite o número " + (i+1) + " do vetor 2");
                        vetor2[i] = sc.nextInt();
                    }
                    System.out.println("Vetor intercalado");
                    int k = 0;
                    for(int i = 0; i < vetor3.length; i += 2){
                        vetor3[i] = vetor1[k];
                        vetor3[i+1] = vetor2[k];
                        k++;
                    }
                    for(int pos: vetor3){
                        System.out.println(pos + " ");
                    }
                    break;

                case 2:
                    int n = 8, contadorP = 0, contadorN = 0;
                    int[] vetor = new int[n];
                    int[] positivo = new int[n];
                    int[] negativo = new int[n];
                    for(int i = 0; i < n; i++){
                        System.out.println("Digite um número inteiro: ");
                        vetor[i] = sc.nextInt();
                        if(vetor[i] >= 0){
                            positivo[contadorP] = vetor[i];
                            contadorP++;
                        } else {
                            negativo[contadorN] = vetor[i];
                            contadorN++;
                        }
                        System.out.println("Vetores positivos");
                        for(int i = 0; i < contadorP; i++){
                            System.out.println(positivo[i] + " ");
                        }
                        for(int i = 0; i < contadorN; i++){
                            System.out.println(negativo[i] + " ");
                        }
                    }
                    break;

                case 3:
                    int n = 10;
                    int[] vetor = new int[n];
                    boolean primo = false;
                    for(int i = 0; i < n; i++){
                        System.out.println("Digite um número inteiro: ");
                        vetor[i] = sc.nextInt();
                        if(vetor[i] % 2 == 0){
                            primo = false;
                            System.out.print("Números primos digitados: " + vetor[i]);
                        }
                    }
                    break;

                case 4:
                    int n = 6, soma, cont = 0;
                    int[] vetorN = new int[n];
                    int[] par = new int[n];
                    int[] impar = new int[n];
                    for(int i = 0; i < n; i++){
                        System.out.println("Digite um número inteiro: ");
                        vetorN[i] = sc.nextInt();
                        if(vetorN[i] % 2 == 0){
                            par[i] = vetor[i];
                            soma += par[i];
                        } else {
                            impar[i] = vetor[i];
                            cont++;
                        }
                        System.out.println("Números pares digitados: " + par[i]);
                        System.out.println("Soma dos números pares: " + soma);
                        System.out.println("Números ímpares digitados: " + impar[i]);
                        System.out.println("Total de números ímpares digitados: " + cont);
                    }
                    break;

                default:
                    break;

            }
        
        } while(op != 0);
        

        sc.close();
    }
}