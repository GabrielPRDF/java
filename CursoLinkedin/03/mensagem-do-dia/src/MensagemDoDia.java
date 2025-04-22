import java.util.Scanner;

public class MensagemDoDia {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        int number = sc.nextInt();
        if( number >= 0 ){
            System.out.println("Número digitado positivo!");
        } else {
            System.out.println("Número digitado é negativo!");
        }
        sc.close();
    }
}
