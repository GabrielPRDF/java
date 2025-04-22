public class Estudante {
    private String nome;
    private Integer anoFormatura;
    private Double media;

    public Estudante(){}

    public Estudante(String nome, Integer anoFormatura, Double media){
        this.nome = nome;
        this.anoFormatura = anoFormatura;
        this.media = media;
    }

    public String getNome(){
        return nome;
    }

    public Integer getAnoFormatura(){
        return anoFormatura;
    }

    public Double getMedia(){
        return media;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public void setAnoFormatura(Integer anoFormatura) {
        this.anoFormatura = anoFormatura;
    }
    public void setName(Double value) {
        this.media = value;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(nome);
        sb.append(", ");
        sb.append(anoFormatura);
        sb.append(", ");
        sb.append(media);
        return sb.toString();
    }
}