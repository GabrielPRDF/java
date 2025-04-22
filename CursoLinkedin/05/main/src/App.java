public class App {
    public static void main(String[] args) throws Exception {
        User user = new User("Gabriel", "12345", "gabriel@gmail.com", true);

        System.out.println(user);
        user.setAtivo(false);
        System.out.println(user);
        System.out.println(User.getLimiteCaracter());
    }
}
