public class App {
    public static void main(String[] args) throws Exception {
        Estudante estudante = new Estudante("Gabriel", 2019, 10.0);
        System.out.println(estudante);
        estudante.setAnoFormatura(2012);
        System.out.println(estudante);
    }
}
