package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizado = idade >= 18;
        if(isAutorizado){
            System.out.println("Pode beber alcool!");
        }else {
            System.out.println("Não pode não");
        }
    }
}
