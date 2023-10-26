public class Carta {
    private String nome;
    private int custo;
    private String descricao;
    private double precoDollar;

    public Carta(){}

    public Carta(String nome, int custo, String descricao, double precoDollar) {
        this.nome = nome;
        this.custo = custo;
        this.descricao = descricao;
        this.precoDollar = precoDollar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoDollar() {
        return precoDollar;
    }

    public void setPrecoDollar(double precoDollar) {
        this.precoDollar = precoDollar;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "nome='" + nome + '\'' +
                ", custo=" + custo +
                ", descricao='" + descricao + '\'' +
                ", precoDollar=" + precoDollar +
                '}';
    }
}
