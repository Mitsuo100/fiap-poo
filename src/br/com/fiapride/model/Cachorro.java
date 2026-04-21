package br.com.fiapride.model;

public class Cachorro {
    private String nome;
    private String raca;
    private int idade;
    private Tutor tutor;

    public Cachorro(String nome, String raca, int idade, Tutor tutor){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.tutor = tutor;
    }

    public void andar(double km){
        if (km <= 0){
            System.out.println("Valor deve ser maior que 0.");
            return;
        }
        System.out.println("O cachorro andou " + km + " km.");
    }

    public void comer(double gramas){
        if (gramas <= 0){
            System.out.println("Valor deve ser maior que 0.");
            return;
        }
        System.out.println("O cachorro comeu " + gramas + " gramas.");
    }

    public String getNome() { return nome; }
    public String getRaca() { return raca; }
    public int getIdade() { return idade; }
    public Tutor getTutor() { return tutor; }

    public void setNome(String nome) { this.nome = nome; }
    public void setRaca(String raca) { this.raca = raca; }

    public void setIdade(int idade) {
        if (idade >= 0) this.idade = idade;
    }
}