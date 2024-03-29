package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10+10);
    }

    public void subDoisNumero(){
        System.out.println(200-100);
    }

    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return (int) (num1/num2);
    }

    public void imprimeDivisaoDoisNumeros(double num1, double num2){
        if (num2 == 0 ){
            System.out.println("Não Existe divisão por zero");
            return;
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

    public void somArray(int[] numeros){
        int soma = 0;
        for (int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somVarArgs(int ... numeros){
        int soma = 0;
        for (int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
