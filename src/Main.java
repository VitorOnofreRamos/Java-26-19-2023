import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var colecao = new Colecao("A Lenda do Dragão Branco de " +
                "Olhos Azuis\n",
                null,
                new ArrayList<>());

        System.out.println(colecao.getPrecoTotal());
        colecao.addCarta(new Carta("Dragão Tri Corno\n",
                0,
                "Um Dragão indigno com trê chifres afiados brotando da sua cabeça.",
                1.25));
        System.out.println(colecao.getPrecoTotal());
        colecao.addCarta(new Carta("Dragão Branco de Olhos Azuis (Brabo)\n",
                0,
                "Este Dragão é uma maquina de destruição.",
                400.25));
        System.out.println(colecao.getPrecoTotal());
        colecao.removeCarta(0);
        System.out.println(colecao.getPrecoTotal());
    }
}