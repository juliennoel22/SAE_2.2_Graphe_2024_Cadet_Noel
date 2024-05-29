import java.util.ArrayList;
import java.util.List;

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
        System.out.println(graphe);



        // Appliquer l'algorithme du point fixe avec 'A' comme point de départ
        BellmanFord bf = new BellmanFord();
        Valeur resultat = bf.resoudre(graphe, "A");
        // Afficher les résultats
        System.out.println(resultat);

        List<String> res = resultat.calculerChemin("E");
        System.out.println(res);

//        public String caracter(String commande, int bool){
//            for (int i = 0, i < bool ; i++){
//                System.out.println(i + commande);
//            }
//        }

    }

}