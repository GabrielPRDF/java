import java.util.Scanner;

public class RepeticaoMusica {
    public static void main(String[] args) throws Exception {
        boolean repeat = true;
        Scanner sc = new Scanner(System.in);
        
        while(repeat) {
            System.out.println("Tocar a música!");
            System.out.println("Devo repetir a música?");
            repeat = sc.nextBoolean();
        }
        sc.close();
    }
}
