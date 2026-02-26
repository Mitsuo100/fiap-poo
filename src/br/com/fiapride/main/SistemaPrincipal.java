package br.com.fiapride.main;

import br.com.fiapride.model.Cachorro;
import java.util.Scanner;

public class SistemaPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cachorro cachorro1 = new Cachorro("Billy", "Vira-lata", 2);
        System.out.print("Digite kms total andados: ");
        Double n1 = scanner.nextDouble();
        System.out.print("Digite o total de comida: ");
        Double n2 = scanner.nextDouble();
        cachorro1.andar(n1);

        cachorro1.comer(n2);

        scanner.close();
    }
}