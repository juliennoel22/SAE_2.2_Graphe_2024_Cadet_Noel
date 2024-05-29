import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DijkstraTests {
        @Test
        public void testDijkstraAlgorithm() {
                GrapheListe graphe = new GrapheListe();
                graphe.ajouterArc("A", "B", 12);
                graphe.ajouterArc("A", "D", 87);
                graphe.ajouterArc("B", "E", 11);
                graphe.ajouterArc("D", "B", 23);
                graphe.ajouterArc("D", "C", 10);
                graphe.ajouterArc("C", "A", 19);
                graphe.ajouterArc("E", "D", 43);

                Valeur resultat = Dijkstra.resoudre(graphe, "A");

                assertEquals(0.0, resultat.getValeur("A"));
                assertEquals(12.0, resultat.getValeur("B"));
                assertEquals(76.0, resultat.getValeur("C"));
                assertEquals(66.0, resultat.getValeur("D"));
                assertEquals(23.0, resultat.getValeur("E"));

                assertEquals(null, resultat.getParent("A"));
                assertEquals("A", resultat.getParent("B"));
                assertEquals("D", resultat.getParent("C"));
                assertEquals("E", resultat.getParent("D"));
                assertEquals("B", resultat.getParent("E"));

        }
}

