import java.util.ArrayList;
import java.util.List;

public class Dijkstra{
    /**
     * Algo en pseudo code
     * Entrées :
     * G un graphe orienté avec une pondération positive des arcs (coût ou poids)
     * A un sommet (d´epart) de G
     *
     * Début
     *  Q <- {} // utilisation d’une liste de noeuds à traiter
     *  Pour chaque sommet v de G faire
     *      v.valeur <- Infini
     *      v.parent <- Indéfini
     *      Q <- Q U {v} // ajouter le sommet v à la liste Q
     *  Fin Pour
     *  A.valeur <- 0
     *  Tant que Q est un ensemble non vide faire
     *      u <- un sommet de Q telle que u.valeur est minimal
     *      // enlever le sommet u de la liste Q
     *      Q <- Q \ {u}
     *      Pour chaque sommet v de Q tel que l’arc (u,v) existe faire
     *          d <- u.valeur + poids(u,v)
     *          Si d < v.valeur
     *              // le chemin est plus interessant
     *              Alors v.valeur <- d
     *              v.parent <- u
     *          Fin Si
     *      Fin Pour
     *  Fin Tant que
     */
    public static Valeur resoudre(Graphe g, String depart){
        Valeur resultat = new Valeur();
        List<String> Q = new ArrayList<>(g.listeNoeuds());
        for(String noeud : g.listeNoeuds()){
            resultat.setValeur(noeud, Double.MAX_VALUE);    // + l'infinie
            resultat.setParent(noeud, null);
            Q.add(noeud);
        }
        resultat.setValeur(depart,0);
        while(!Q.isEmpty()){
            //Trouver le sommet u avec une valeur minimale
            String u = null;
            double min = Double.MAX_VALUE;
            for(String noeud : Q){
                double val = resultat.getValeur(noeud);
                if(val < min){
                    min = val;
                    u = noeud;
                }
            }
            //Si u est null, il n'y a pas de noeud
            if(u == null){
                break;
            }
            //Enlever le sommet u de la liste Q
            Q.remove(u);
            //Parcourir tous les arcs partant du noeud actuel
            for(Arc arc : g.suivants(u)){
                String destination = arc.getDest();
                double cout = arc.getCout();
                //Vérifier si un chemin plus court est trouvé
                double d = resultat.getValeur(u) + cout;
                if(d < resultat.getValeur(destination)){
                    resultat.setValeur(destination, d);
                    resultat.setParent(destination, u);
                }
            }
        }
        return resultat;
    }
}
