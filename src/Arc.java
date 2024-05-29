public class Arc {
    /*Attributs*/
    String dest; //nom du nœud destination de l’arc
    double cout; //poids de l'arc

    /**
     * Constructeur Arc
     *
     * @param dest nœud de destination
     * @param cout poids de l'arc
     */
    public Arc(String dest, double cout) {
        this.dest = dest;
        this.cout = cout;
    }

    @Override
    public String toString() {
        return "Arc{" +
                "dest='" + dest + '\'' +
                ", cout=" + cout +
                "}\n";
    }
}
