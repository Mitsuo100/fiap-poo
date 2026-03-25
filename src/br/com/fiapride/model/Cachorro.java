package br.com.fiapride.model;

public class Cachorro {
    private String nome;
    private String raca;
    private int idade;
    private double kms;
    private double gr;

    public Cachorro(String nome, String raca, int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.kms = 0.0;
        this.gr = 0.0;
    }

    public void andar(double km){
        if (km <= 0){
            System.out.println("Valor deve ser maior que 0.");
            return;
        }
        this.kms += km;
        System.out.println("Total de KMs andados: " + this.kms);
    }

    public void comer(double gramas){
        if (gramas <= 0){
            System.out.println("Valor deve ser maior que 0.");
            return;
        }
        this.gr += gramas;
        System.out.println("Total de ração comida: " + this.gr);
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public double getKms() {
        return kms;
    }

    public double getGr() {
        return gr;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade inválida.");
            return;
        }
        this.idade = idade;
    }

    public void setKms(double kms) {
        if (kms < 0) {
            System.out.println("Valor inválido.");
            return;
        }
        this.kms = kms;
    }

    public void setGr(double gr) {
        if (gr < 0) {
            System.out.println("Valor inválido.");
            return;
        }
        this.gr = gr;
    }
}