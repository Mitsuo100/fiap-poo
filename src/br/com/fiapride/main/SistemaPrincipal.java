package br.com.fiapride.main;

import br.com.fiapride.model.Cachorro;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Billy";
        cachorro1.raca = "Spitz";
        cachorro1.idade = 9;

        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Nome " + cachorro1.nome + " | Raça: " + cachorro1.raca + " | Idade: " + cachorro1.idade);
    }
}