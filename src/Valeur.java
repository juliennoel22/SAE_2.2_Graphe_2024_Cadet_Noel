import java.util.*;

/**
 * Classe fournie, permet de stocker des valeurs associées au noeud et des parents
 * - un noeud est represente par un String (son nom)
 * - on accede avec des get (getValeur et getParent)
 * - on modifie avec des set (setValeur et setParent)
 */
public class Valeur {

    /**
     * attributs pour stocker les informations (type Table = Dictionnaire)
     * dans le programme de 2 annee.
     */
    Map<String, Double> valeur;
    Map<String, String> parent;

    /**
     * constructeur vide (initialise la possibilité de stocker des valeurs)
     */
    public Valeur() {
        this.valeur = new TreeMap<>();
        this.parent = new TreeMap<>();
    }

    /**
     * permet d'associer une valeur a un nom de noeud (ici L(X))
     *
     * @param nom    le nom du noeud
     * @param valeur la valeur associée
     */
    public void setValeur(String nom, double valeur) {
        // modifie valeur
        this.valeur.put(nom, valeur);
    }

    /**
     * * permet d'associer un parent a un nom de noeud (ici parent(X))
     *
     * @param nom    nom du noeud
     * @param parent nom du noeud parent associe
     */
    public void setParent(String nom, String parent) {
        this.parent.put(nom, parent);
    }

    /**
     * accede au parent stocke associe au noeud nom passe en parametre
     *
     * @param nom nom du noeud
     * @return le nom du noeud parent
     */
    public String getParent(String nom) {
//        System.out.println(this.parent.get(nom)); // A enlever
        return this.parent.get(nom);
    }


    /**
     * accede a la valeur associee au noeud nom passe en parametre
     *
     * @param nom nom du noeud
     * @return la valeur stockee
     */
    public double getValeur(String nom) {
        return this.valeur.get(nom);
    }

    /**
     * retourne une chaine qui affiche le contenu
     * - par noeud stocke
     * - a chaque noeud, affiche la valeur puis le noeud parent
     *
     * @return descriptif du noeud
     */
    public String toString() {
        String res = "";
        // pour chaque noeud
        for (String s : this.valeur.keySet()) {
            // ajoute la valeur et le noeud parent
            Double valeurNoeud = valeur.get(s);
            String noeudParent = parent.get(s);
            res += s + " ->  V:" + valeurNoeud + " p:" + noeudParent + "\n";
        }
        return res;

    }

    /**
     * Méthode calculerChemin
     * Calcule le chemin du noeud de départ au noeud passé en paramètre
     * @param destination
     * @return chemin du noeud de départ au noeud destination
     */
    public List<String> calculerChemin(String destination) {
        List<String> chemin = new ArrayList<>();
        String courant = destination;

        // Remonter les parents pour reconstruire le chemin
        while (getParent(courant) != null) {
            chemin.add(courant);  // Ajoute le nœud au début de la liste pour construire le chemin correctement
            courant = getParent(courant);  // Aller au parent du nœud courant
        }
        chemin.add(courant);
        Collections.reverse(chemin);

        return chemin;
    }

}
