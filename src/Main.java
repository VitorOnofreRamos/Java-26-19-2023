import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var colecao = new Colecao(" LENDA DO DRAGÃO BRANCO DE " +
                "OLHOS AZUIS (LC01 Edição do 25º Aniversário):\n",
                null,
                new ArrayList<>());

        System.out.println(colecao.getPrecoTotal());
        colecao.addCarta(new Carta(78,
                "Dragão de Três Chifres\n",
                0,
                "Um dragão indigno com três chifres afiados brotando da sua cabeça.",
                1.25
        ));
        System.out.println(colecao.getPrecoTotal());
        colecao.addCarta(new Carta(43,
                "Dragão Branco de Olhos Azuis\n",
                0,
                "Este dragão lendário é uma poderosa máquina de destruição. " +
                 "Praticamente invencível, muito poucos enfrentaram esta magnífica criatura e viveram para contar a história.",
                400.25
        ));
        System.out.println(colecao.getPrecoTotal());
        //colecao.removeCarta(0);
        System.out.println(colecao.getPrecoTotal());
        colecao.addCarta(new Carta(3,
                "Mago Negro\n",
                0,
                "O mago definitivo em termos de ataque e defesa.",
                395.25
        ));
        //System.out.println(colecao.BuscarCartaPorNome("Mago"));
        System.out.println(colecao);
    }
}