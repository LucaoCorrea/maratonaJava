package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero1 = 25;
        double numero2 = 12;
        double resultado = (short) (numero1 /numero2); //casting
        System.out.println(resultado);

        //% - podemos ver se o number é par ou impar

        int resto = 20 % 2;
        if (resto == 0) {
            System.out.println("The number is Divisible");
        } else {
            System.out.println("The number is non-Divisible");
        }

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte " + isDezIgualQueVinte);

    }
}
