import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o número de horas trabalhadas: ");
        double horas = sc.nextDouble();
        sc.nextLine();
        System.out.print("Informe o preço da hora: ");
        double preco = sc.nextDouble();
        sc.nextLine();
        System.out.println("Valor salarios é " + String.format("%.2f" ,calculaSalario(horas, preco)));
        sc.close();
    }

    public static Double calculaSalario(Double horas, Double valor){
        return (double) horas * valor;
    }
}
