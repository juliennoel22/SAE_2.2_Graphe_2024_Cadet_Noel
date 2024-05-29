public class BellmanFord{
    /**
     * Méthode resoudre
     * @param g graphe
     * @param depart point de départ du point fixe
     * @return disantces et parents de chaque noeud
     */
    public Valeur resoudre(Graphe g, String depart) {
        Valeur resultat = new Valeur();
        boolean modifie = false;

        //Initialisation des distances et des parents
        for(String noeud : g.listeNoeuds()){
            resultat.setValeur(noeud, Double.MAX_VALUE);    // + l'infinie
            resultat.setParent(noeud, null);
        }

        //Définir la distance du noeud de départ à 0
        resultat.setValeur(depart, 0);

        //Boucle principale de l'algorithme de Bellman-Ford
        while(modifie == false){
            modifie = false;
            //Parcourir tous les noeuds du graphe
            for (String noeud : g.listeNoeuds()) {
                //Parcourir tous les arcs partant du noeud actuel
                for(Arc arc : g.suivants(noeud)){
                    String destination = arc.getDest();
                    double cout = arc.getCout();

                    //Vérifier si un chemin plus court est trouvé
                    if(resultat.getValeur(noeud) + cout < resultat.getValeur(destination)){
                        resultat.setValeur(destination, resultat.getValeur(noeud) + cout);
                        resultat.setParent(destination, noeud);
                        modifie = true;
                    }
                }
            }
        }
        return resultat;
    }
}
