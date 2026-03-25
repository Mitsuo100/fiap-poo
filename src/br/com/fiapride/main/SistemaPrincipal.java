package br.com.fiapride.main;

import br.com.fiapride.model.Cachorro;
import java.util.Scanner;

public class SistemaPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Raça: ");
        String raca = scanner.next();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        Cachorro cachorro1 = new Cachorro(nome, raca, idade);

        System.out.println("\nCachorro criado:");
        System.out.println("Nome: " + cachorro1.getNome());
        System.out.println("Raça: " + cachorro1.getRaca());
        System.out.println("Idade: " + cachorro1.getIdade());

        System.out.print("\nQuantos kms ele andou? ");
        double km = scanner.nextDouble();
        cachorro1.andar(km);

        System.out.print("Quantas gramas ele comeu? ");
        double gr = scanner.nextDouble();
        cachorro1.comer(gr);

        scanner.close();
    }
}