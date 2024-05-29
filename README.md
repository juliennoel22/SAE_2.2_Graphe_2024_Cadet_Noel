# SAE_2.2_Graphe_2024_Cadet_Noel
- CADET Matteo
- NOEL Julien

## Analyse des résultats

Les 2 méthodes permettent de trouver les même résultats, comme prévu.

Maintenant, il peut être intéressant de comparer les temps d'execution de chaque méthode.

Expérimentalement, c'est l'algorithme de Dijkstra qui est le plus efficace.

 > Calculons la complexité de chaque méthode.

Nous allons prendre le graphe donné dans l'énoncé

A B 12
A D 87
B E 11
D B 23
D C 10
C A 19
E D 43

### Méthode Dijkstra

Complexité = (arêtes + sommets) x ln(sommet)
Complexité g = (7 + 5) x ln(5)

### Méthode BelmanFord

Complexité = arêtes x sommets
Complexité g = 7 x 5 = 35


