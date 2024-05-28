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
    public String toString() {
        return "GrapheListe{" +
                "noeuds=" + noeuds +
                ", adjacente=" + adjacente +
                "}\n";
    }

    /**
     * Méthode toString
     * Retourne une représentation textuelle du graphe
     * @return une chaîne de caractères représentant le graphe
     * On souhaite pouvoir afficher le contenu d’un objet GrapheListe sous la forme d’une
     * chaˆıne de caract`eres structur´ee de la mani`ere suivante :
     * fichier
     * A -> B(12) D(87)
     * B -> E(11)
     * C -> A(19)
     * D -> B(23) C(10)
     * E -> D(43)
     * Ecrire une m´ethode ´ toString permettant d’afficher le graphe sous cette forme.
     */

//    @Override
//    public String toString() {
//        String s = "";
//        for (int i = 0; i < noeuds.size(); i++) {
//            s += noeuds.get(i) + " -> ";
//            List<Arc> arcs = adjacente.get(i).getArcs();
//            for (int j = 0; j < arcs.size(); j++) {
//                s += arcs.get(j).dest + "(" + arcs.get(j).cout + ") ";
//            }
//            s += "\n";
//        }
//        return s;
//    }

    @Override
    public List<String> listeNoeuds() {
        return noeuds;
    }
}

