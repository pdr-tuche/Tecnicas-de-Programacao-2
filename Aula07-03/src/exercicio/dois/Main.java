package exercicio.dois;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cd> stock = new ArrayList<>();

        Cd zezo = new Cd("Amor Traquino (ao vivo)", "Zezo", 14, 99.90);
        Cd luzinete = new Cd("Luzinete Ao Vivo em Sapé", "Luzinete a Rainha da Seresta", 20, 149.99);
        Cd pepeMoreno = new Cd("No Bar Da Boa", "Pepe Moreno", 15, 49.90);
        Cd joseRibeiro = new Cd("Simplesmente José Ribeiro", "José Ribeiro", 12, 49.99);
        Cd genivalSantos = new Cd("Seleção De Ouro", "Genival Santos", 20, 99.99);

        stock.add(zezo);
        stock.add(luzinete);
        stock.add(pepeMoreno);
        stock.add(joseRibeiro);
        stock.add(genivalSantos);

        Cd moreTracks = moreTracks(stock);
        System.out.printf("O album com mais faixas é: \n" + moreTracks.toString());

        Cd cheaper = cheapestCd(stock);
        System.out.printf("O album mais barato é: \n" + cheaper.toString());

    }

    public static Cd moreTracks(List<Cd> list) {
        Cd moreTracks = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (moreTracks.getNumberOfSongs() < list.get(i).getNumberOfSongs()) {
                moreTracks = list.get(i);
            }
        }
        return moreTracks;
    }

    public static Cd cheapestCd(List<Cd> list) {
        Cd cheaper = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (cheaper.getPrice() > list.get(i).getPrice()) {
                cheaper = list.get(i);
            }
        }
        return cheaper;
    }
}
