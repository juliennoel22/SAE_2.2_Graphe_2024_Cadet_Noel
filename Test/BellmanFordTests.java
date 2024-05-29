import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BellmanFordTests {

    @Test
    public void testBellmanFordAlgorithm() {
        // Création du graphe
        GrapheListe graphe = new GrapheListe();
        graphe.ajouterArc("A", "B", 12);
        graphe.ajouterArc("A", "D", 87);
        graphe.ajouterArc("B", "E", 11);
        graphe.ajouterArc("D", "B", 23);
        graphe.ajouterArc("D", "C", 10);
        graphe.ajouterArc("C", "A", 19);
        graphe.ajouterArc("E", "D", 43);

        // Application de l'algorithme de Bellman-Ford
        Valeur resultat = BellmanFord.resoudre(graphe, "A");

        // Assertions pour vérifier les distances à partir du nœud "A"
        assertEquals(0.0, resultat.getValeur("A"), 0.01);
        assertEquals(12.0, resultat.getValeur("B"), 0.01);
        assertEquals(76.0, resultat.getValeur("C"), 0.01);
        assertEquals(66.0, resultat.getValeur("D"), 0.01);
        assertEquals(23.0, resultat.getValeur("E"), 0.01);

        // Assertions pour vérifier les parents des nœuds
        assertEquals(null, resultat.getParent("A"));
        assertEquals("A", resultat.getParent("B"));
        assertEquals("D", resultat.getParent("C"));
        assertEquals("E", resultat.getParent("D"));
        assertEquals("B", resultat.getParent("E"));
    }
}
