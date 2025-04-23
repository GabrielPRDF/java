import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) throws Exception {
        Boolean respond = false;
        Scanner sc = new Scanner(System.in);
        char letra;
        do {
            printQuiz();
            letra = sc.nextLine().charAt(0);
            if (letra == 'D') {
                respond = true;
            }
        } while(!respond);
    }

    public static void printQuiz(){
        System.out.println("Responta a questão a seguir:");
        System.out.println("Qual o maior mamífero atualemnte?");
        System.out.print("A - Elefante!");
        System.out.println();
        System.out.print("B - Girafa!");
        System.out.println();
        System.out.print("C - Crocodilo!");
        System.out.println();
        System.out.print("D - Baleia-azul!");
        System.out.println();
    }
}
