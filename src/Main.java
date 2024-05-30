import java.util.ArrayList;
import java.util.List;

/**
 * Classe Main
 * Exécute la méthode du point fixe de Bellman Ford
 */
public class Main {
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
        double duree;
        double duree_ms;
        long date_debut = System . nanoTime () ; //début du chronomètre
        Valeur resultat = null;
        // Appliquer l'algorithme du point fixe avec 'A' comme point de départ
        for (int i = 0; i < 100 ; i++){
            BellmanFord bf = new BellmanFord();
            resultat = bf.resoudre(graphe, "A");
        }


        //Arrêt du chronomètre et calcul du temps en ns et en ms + affichage
        long date_fin = System . nanoTime () ;
        duree = (date_fin - date_debut) /100;
        duree_ms = duree / 1000000;
        System.out.println("La duree de calcul du point fixe avec la méthode de Belman Ford est de : " + duree + "ns" + " ou " + duree_ms + "ms");

        // Afficher les résultats
        System.out.println("Valeurs de distance pour chaque nœud (V) + Parent (p) : \n" + resultat);

        List<String> res = resultat.calculerChemin("C");
        System.out.println("Chemin pour aller de A à C : "+res);

    }

}