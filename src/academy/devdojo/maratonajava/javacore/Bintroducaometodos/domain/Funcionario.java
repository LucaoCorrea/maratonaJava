package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Funcionario {
    private String nome;
    private int idade;
    private  double media = 0;
    private double[] salarios;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(double salario: salarios){
            System.out.println(salario + "");
        }
        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial(){

        for (double salario: salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Média Salarial " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getMedia() {
        return media;
    }



    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
}
