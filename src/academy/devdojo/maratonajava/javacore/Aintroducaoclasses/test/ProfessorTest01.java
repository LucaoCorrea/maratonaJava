package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Celso";
        professor.idade = 83;
        professor.sexo = 'M';

        System.out.println(professor.nome + professor.sexo + professor.idade);
    }
}