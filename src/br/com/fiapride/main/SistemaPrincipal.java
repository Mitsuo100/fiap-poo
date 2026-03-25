package br.com.fiapride.main;

import br.com.fiapride.model.Cachorro;
import java.util.Scanner;

public class SistemaPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cachorro cachorro1 = new Cachorro("Billy", "Vira-lata", 2);

        System.out.print("Digite o novo nome: ");
        String nome = scanner.next();

        System.out.print("Digite a nova raça: ");
        String raca = scanner.next();

        System.out.print("Digite a nova idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite kms total andados: ");
        double kms = scanner.nextDouble();

        System.out.print("Digite o total de comida: ");
        double comida = scanner.nextDouble();

        cachorro1.setNome(nome);
        cachorro1.setRaca(raca);
        cachorro1.setIdade(idade);
        cachorro1.setKms(kms);
        cachorro1.setGr(comida);

        System.out.println("\nCachorro atualizado:");
        System.out.println("Nome: " + cachorro1.getNome());
        System.out.println("Raça: " + cachorro1.getRaca());
        System.out.println("Idade: " + cachorro1.getIdade());
        System.out.println("KMs: " + cachorro1.getKms());
        System.out.println("Comida: " + cachorro1.getGr());

        scanner.close();
    }
}