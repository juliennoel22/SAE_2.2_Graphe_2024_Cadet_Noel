import java.util.List;

public interface Graphe {
    /*
     * Méthode qui retourne tous les noeuds du graphe
     * (sous la forme d’une liste de String)
     */
    List<String> listeNoeuds();
    /*
     * Méthode qui retourne la liste des arcs partant
     * du noeud n passé en paramètre.
     */
    List<Arc> suivants(String n);
}
