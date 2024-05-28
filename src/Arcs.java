import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arcs {
    //Attributs
    List<Arc> arcs;

    /**
     * Constructeur Arcs
     * Créé une liste vide d'arcs
     */
    public Arcs() {
        this.arcs = new ArrayList();
    }

    /**
     * Méthode ajouterArc
     * Ajoute un arc à la liste d'arcs
     * @param a arc à ajouter
     */
    public void ajouterArc(Arc a){
        this.arcs.add(a);
    }

    /**
     * Méthode getArcs()
     * retourne la liste d'arcs
     * @return la liste d'arcs
     */
    public List<Arc> getArcs(){
        return this.arcs;
    }
}
