package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double. float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = (short) 1000000; //casting
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "Piticão";
        var nome2 = "Lucas"; //nivel de linguaguem mais alta do JDK
        System.out.println("A idade é de " + idade);
        System.out.println(idadeShort);
        System.out.println(nome);
        System.out.println(nome2);

    }
}