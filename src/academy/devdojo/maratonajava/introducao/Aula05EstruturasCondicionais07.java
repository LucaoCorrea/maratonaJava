package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais07 {
    public static void main(String[] args) {
        //dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        //considerando 1 como domingo
        byte dia = 5;
        switch (dia) {
            case 1:
                System.out.println("Dom - Fim de Semana");
                break;
            case 2:
                System.out.println("Seg - Dia Útil");
                break;
            case 3:
                System.out.println("Ter - Dia Útil");
                break;
            case 4:
                System.out.println("Quart - Dia Útil");
                break;
            case 5:
                System.out.println("Quint - Dia Útil");
                break;
            case 6:
                System.out.println("Sex - Dia Útil");
                break;
            case 7:
                System.out.println("Sab - Fim de Semana");
                break;
            default:
                System.out.println("Opção Inválida");
                break;

        }
    }
}
