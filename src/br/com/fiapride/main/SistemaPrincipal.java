package br.com.fiapride.main;

import br.com.fiapride.model.Cachorro;
import br.com.fiapride.model.Tutor;
import java.util.Scanner;

public class SistemaPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do cachorro: ");
        String nome = scanner.nextLine();

        System.out.print("Raça: ");
        String raca = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome do tutor: ");
        String nomeTutor = scanner.nextLine();

        System.out.print("Telefone do tutor: ");
        String telefone = scanner.nextLine();

        Tutor tutor = new Tutor(nomeTutor, telefone);

        Cachorro cachorro1 = new Cachorro(nome, raca, idade, tutor);

        System.out.println("\nCachorro criado:");
        System.out.println("Nome: " + cachorro1.getNome());
        System.out.println("Raça: " + cachorro1.getRaca());
        System.out.println("Idade: " + cachorro1.getIdade());

        System.out.println("Tutor: " + cachorro1.getTutor().getNome());

        System.out.print("\nQuantos kms ele andou? ");
        double km = scanner.nextDouble();
        cachorro1.andar(km);

        System.out.print("Quantas gramas ele comeu? ");
        double gr = scanner.nextDouble();
        cachorro1.comer(gr);

        scanner.close();
    }
}