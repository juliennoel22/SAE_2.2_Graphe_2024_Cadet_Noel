import java.util.ArrayList;
import java.util.List;

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

    public List<Arc> suivants(String n){
        int i = noeuds.indexOf(n);
        if(i!=-1)
            return adjacente.get(i).getArcs();
        else
            return new ArrayList<Arc>();
    }

    /**
     * Méthode ajouterArc
     */
    public void ajouterArc(String depart, String destination, double cout) {
        if (!noeuds.contains(depart)) {
            noeuds.add(depart);
            adjacente.add(new Arcs());
        }
        if (!noeuds.contains(destination)) {
            noeuds.add(destination);
            adjacente.add(new Arcs());
        }

        int i = getIndice(depart);
        adjacente.get(i).ajouterArc(new Arc(destination, cout));
    }
    @Override
    public List<String> listeNoeuds() {
        return noeuds;
    }
}

