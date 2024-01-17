package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(double salario: salarios){
            System.out.println(salario + "");
        }
        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial(){
        double media = 0;
        for (double salario: salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Média Salarial " + media);
    }
}
