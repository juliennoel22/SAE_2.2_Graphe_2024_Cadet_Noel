import java.util.List;

/**
 * Classe MainDijkstra
 * Exécute la méthode de Dijkstra
 */
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

        // Variables de durées
        double total = 0;
        double duree;
        double duree_ms;
        Valeur resultat_dij = null;

        Dijkstra dij = new Dijkstra();

        //Calcul des chemins les plus courts
        for (int i = 0; i < 100 ; i++){
            long date_debut = System . nanoTime () ; //début du chronomètre
            resultat_dij = dij.resoudre(graphe, "A");
            long date_fin = System . nanoTime () ;
            total += date_fin-date_debut;
        }

        //Arrêt du chronomètre et calcul du temps en ns et en ms + affichage
        duree = total/100 ;
        duree_ms = duree / 1000000;
        System.out.println("La duree de calcul du point fixe avec la méthode de Djikstra est de : " + duree + "ns" + " ou " + duree_ms + "ms");


        // Afficher les résultats
        System.out.println("Valeurs de distance pour chaque nœud (V) + Parent (p) : \n" + resultat_dij);

        List<String> res_dij = resultat_dij.calculerChemin("C");
        System.out.println("Chemin pour aller de A à C : "+res_dij);
    }
}
