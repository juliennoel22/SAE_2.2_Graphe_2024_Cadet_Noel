import java.util.ArrayList;

public class GrapheListe implements Graphe{
    //Attributs
    ArrayList<String> noeuds;   //liste des noeuds du graphe
    ArrayList<Arcs> adjacente;  //liste des arcs partant des noeuds

    /**
     * Constructeur
     */
    public GrapheListe(){
        this.noeuds = new ArrayList();
        this.adjacente = new ArrayList();
    }

    /**
     * Méthode getIndice
     * Retourne l'indice du noeud
     * @param n
     * @return
     */
    public int getIndice(String n){
        return noeuds.indexOf(n);
    }
}
