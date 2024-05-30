public class Arc {
    /*Attributs*/
    String dest; //nom du noeud destination de l’arc
    double cout; //poids de l'arc

    /**
     * Constructeur Arc
     * @param dest noeud de destination
     * @param cout poids de l'arc
     */
    public Arc(String dest, double cout) {
        this.dest = dest;
        this.cout = cout;
    }

    /**
     * Méthode getDest
     * @return le noeud de destination
     */
    public String getDest(){
        return this.dest;
    }

    /**
     * Méthode getCout
     * @return le poids de l'arc
     */
    public double getCout(){
        return this.cout;
    }

    /**
     * Méthode toString
     * @return l'affichage de la destination de l'arc et son coût
     */
    @Override
    public String toString() {
        return "Arc{" +
                "dest='" + dest + '\'' +
                ", cout=" + cout +
                "}\n";
    }
}
