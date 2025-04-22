import java.util.Scanner;

public class EstudanteApp {
    public static void main(String[] args) throws Exception {
        Integer idade = 30;
        char inicialDoNome = 'G';
        char inicialDoSobrenome = 'F';
        Double media = 10.0;
        Boolean aprovado = true;
        String nome = "Gabriel";
        String sobrenome = " P R Fonseca";
        System.out.println(idade + ", " + inicialDoNome +  ", " + inicialDoSobrenome +  ", " + media +  ", " + aprovado +  ", " + nome + sobrenome);
        System.out.println(nome.charAt(0));
        System.out.println(nome.charAt(1));
        System.out.println(nome.length());
        System.out.println(nome.charAt(nome.length()-1));
        System.out.println(nome.equals(sobrenome));

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a média: ");
        media = sc.nextDouble();
        System.out.println("Média = " + media);
    }
}
