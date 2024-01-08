package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepetição01 {
    public static void main(String[] args) {
        // while do while for
        int count = 0;
        while (count < 10) {
            count++;
            System.out.println(count);
        }
        do {
            System.out.println("Dentro do Do");
        } while (count < 10);

        for (int i = 0; i < 10; i++ ){
            System.out.println(i);
        }
    }
}
