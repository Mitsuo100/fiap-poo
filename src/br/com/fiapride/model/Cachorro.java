package br.com.fiapride.model;

public class Cachorro {
    public String nome;
    public String raca;
    public int idade;
    public double kms;
    public double gr;

    public Cachorro(String nome, String raca, int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.kms = 0.0;
        this.gr = 0.0;
    }
    public void andar(double km){
        if (km<= 0){
            System.out.println("Valor deve ser maior que 0.");
            return;
        }
        this.kms += km;
        System.out.println("Total de KMs andados: " + this.kms);
    }

    public void comer(double gramas){
        if (gramas<= 0){
            System.out.println("Valor deve ser maior que 0.");
            return;
        }
        this.gr += gramas;
        System.out.println("Total de ração comida: " + this.gr);
    }
}
