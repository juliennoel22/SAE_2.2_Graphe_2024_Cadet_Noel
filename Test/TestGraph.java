import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGraph {
    @Test
    public void TestGraphGood(){
        GrapheListe graphe = new GrapheListe();

        //Ajout de quelques arcs
        graphe.ajouterArc("A", "B", 12);
        graphe.ajouterArc("A", "D", 87);
        graphe.ajouterArc("B", "E", 11);
        graphe.ajouterArc("D", "B", 23);
        graphe.ajouterArc("D", "C", 10);
        graphe.ajouterArc("C", "A", 19);
        graphe.ajouterArc("E", "D", 43);

        String res = graphe.toString();

        //Vérif
        assertEquals("A -> B(12.0) D(87.0) \n" +
                "B -> E(11.0) \n" +
                "D -> B(23.0) C(10.0) \n" +
                "E -> D(43.0) \n" +
                "C -> A(19.0) \n",res,"Le ne correspond pas");
    }
}
