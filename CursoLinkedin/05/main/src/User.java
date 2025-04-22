public class User {
    private String name;
    private String password;
    private String email;
    private Boolean ativo;
    private static final int NUMERO_DEFINIDO = 10;

    public User() {}

    public User(String name, String password, String email, Boolean ativo){
        this.name = name;
        this.password = password;
        this.email = email;
        this.ativo = ativo;
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }

    public String getEmail(){
        return email;
    }

    public Boolean getAtivo(){
        return ativo;
    }

    public void setName(String name){
         this.name = name;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public void setAtivo(Boolean ativo){
        this.ativo = ativo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(", ");
        sb.append(email);
        sb.append(", ");
        sb.append(password);
        sb.append(", ");
        sb.append(ativo);
        return sb.toString();
    }

    public static int getLimiteCaracter(){
        return NUMERO_DEFINIDO;
    }
}
