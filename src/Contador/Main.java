package Contador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro parâmetro: ");
            int n1 = scanner.nextInt();

            System.out.print("Digite o segundo parâmetro: ");
            int n2 = scanner.nextInt();

            if (n1 >= n2){
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            for (int i = n1; i < n2; i++) {
                System.out.println(i + 1);
            }

        }catch (ParametrosInvalidosException e){
            System.out.println("Erro: " + e.getMessage());


        }
    }

}
