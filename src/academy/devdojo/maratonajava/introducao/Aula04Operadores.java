package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero1 = 25;
        double numero2 = 12;
        double resultado = (short) (numero1 / numero2); //casting
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

        // AND - &&
        // OR - ||
        // NO - !

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation ;
        System.out.println(isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println("O Bônus é de " + bonus);

        // ++ --
        int contador = 0;
        contador += 1; // contador = contador + 1
        contador++; // contador = contador + 1
        contador--; // contador = contador - 1
        System.out.println(contador);
    }
}