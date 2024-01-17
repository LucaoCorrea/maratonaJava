package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        estudante.nome = "Gohan";

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }

}
