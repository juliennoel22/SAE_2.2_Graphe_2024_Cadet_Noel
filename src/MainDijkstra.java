public class MainDijkstra {
    public static void main(String[] args) {
        GrapheListe graphe = new GrapheListe();

        // Ajouter les arcs selon la figure 1
        graphe.ajouterArc("A", "B", 12);
        graphe.ajouterArc("A", "D", 87);
        graphe.ajouterArc("B", "E", 11);
        graphe.ajouterArc("D", "B", 23);
        graphe.ajouterArc("D", "C", 10);
        graphe.ajouterArc("C", "A", 19);
        graphe.ajouterArc("E", "D", 43);

        // Afficher les noeuds
        System.out.println("Noeuds : \n" + graphe);


        
    }
}
