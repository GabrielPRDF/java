public class Lanche {
    public static void main(String[] args) throws Exception {
        System.out.println("Antes do alarme!");
        alarmeHoraDoLanche();
        System.out.println("Depois do alarme!");
        Double media = calcularMedia(10.00, 9.00, 8.00);
        System.err.printf("Média: %.2f %n", media);
        resultMedia(media);
    }

    public static void alarmeHoraDoLanche(){
        System.out.println("Hora do Lanche!");
    }

    public static Double calcularMedia(Double nota1, Double nota2, Double nota3){
        return (nota1 + nota2 + nota3) / 3;
    }

    public static void resultMedia(Double media){
        if (media > 6) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
