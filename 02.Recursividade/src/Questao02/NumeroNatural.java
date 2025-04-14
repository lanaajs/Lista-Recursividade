package Questao02;

import java.util.Scanner;

public class NumeroNatural {

    public static int SomarNaturais(int num) {
		if (num == 1) {
            return 1;
        }

        return num + SomarNaturais (num - 1);
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("\n\nDigite um número: ");
        int n = sc.nextInt();
        
        int soma = SomarNaturais(n);
        
        System.out.println("Soma dos número antecedores de " + n + " é " + soma);

        sc.close();
    }
}
