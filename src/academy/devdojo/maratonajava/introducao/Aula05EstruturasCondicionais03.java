package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //doar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho grana";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar; //forma mais longa
        String resultado2 = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho grana";
        //forma mais curta

        System.out.println("Resultado 1: " + resultado);
        System.out.println("Resultado 2: " + resultado2);
    }
}
