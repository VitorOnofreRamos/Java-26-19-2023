import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Colecao {
    private String nome;
    private Date dataDeLancamento;
    private double precoTotal;
    private List<Carta> cartas = new ArrayList<>();

    public Colecao(String nome, Date dataDeLancamento, List<Carta> cartas) {
        this.nome = nome;
        this.dataDeLancamento = dataDeLancamento;
        this.cartas = cartas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(Date dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public void addCarta(Carta carta){
        this.cartas.add(carta);
        AtualizarPrecoTotal();
    }

    public void removeCarta(int posicao){
        this.cartas.remove(posicao);
        AtualizarPrecoTotal();
    }

    private void AtualizarPrecoTotal() {
        this.precoTotal = this.cartas.stream()
                .mapToDouble(Carta::getPrecoDollar)
                .sum();
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    @Override
    public String toString() {
        return "Colecao{" +
                "nome='" + nome + '\'' +
                ", dataDeLancamento=" + dataDeLancamento +
                ", precoTotal=" + precoTotal +
                ", cartas=" + cartas +
                '}';
    }

    public List<Carta> BuscarCartaPorNome(String nome){
        return this.cartas.stream()
                .filter(carta -> carta.getNome().toLowerCase()
                        .contains(nome.toLowerCase())).toList();
    }
}
