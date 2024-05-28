import java.util.List;

public interface Graphe {
    /*
     * Méthode qui retourne tous les nœuds du graphe
     * (sous la forme d’une liste de String)
     */
    List<String> listeNoeuds();
    /*
     * Méthode qui retourne la liste des arcs partant
     * du nœud n pass´e en param`etre.
     */
    List<Arc> suivants(String n);
}
