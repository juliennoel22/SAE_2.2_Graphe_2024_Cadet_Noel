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

    public List<Arc> suivant(String n){
        int i = noeuds.indexOf(n);
        if(i!=-1)
            return adjacente.get(i).getArcs();
        else
            return new ArrayList<Arc>();
    }

    /**
     * Méthode ajouterArc
     */
    public void ajouterArc(String depart, String destination, double cout){
        if(noeuds.contains(depart))
            noeuds.add(depart);
        if(noeuds.contains(destination))
            noeuds.add(destination);
        Arc arc = new Arc(destination,cout);
        List<Arc> suivant = suivant(depart);
        if(!suivant.contains(arc)){
            int i = getIndice(depart);
            if(i != -1)
                adjacente.get(getIndice(depart)).ajouterArc(arc);
            else
                Arcs arcs = new Arcs();
                arcs.ajouterArc(arc);
                adjacente.add(arcs);
        }
    }
}
