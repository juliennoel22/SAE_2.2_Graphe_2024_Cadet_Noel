# SAE_2.2_Graphe_2024_Cadet_Noel
- CADET Matteo
- NOEL Julien

## Analyse des résultats

Les 2 méthodes permettent de trouver les même résultats, comme prévu.

Maintenant, il peut être intéressant de comparer les temps d'execution de chaque méthode.

Expérimentalement, c'est l'algorithme de Dijkstra qui est le plus efficace.

___

### Tentative de vérification 1 - (échec)

Nous avons voulu le vérifier gra^ce aux formules de calcul de la complexité, mais il s'est avéré que ce n'était pas la bonne méthode à utiliser. Voici notre raisonnement qui n'est pas à prendre en compte.

 > Calculons la complexité de chaque méthode.

Nous allons prendre le graphe donné dans l'énoncé

```
A B 12
A D 87
B E 11
D B 23
D C 10
C A 19
E D 43
```

#### Méthode Dijkstra

`Complexité = (arêtes + sommets) x ln(sommet)`
`Complexité g = (7 + 5) x ln(5) = 19,31 (environ)`

#### Méthode BelmanFord

`Complexité = arêtes x sommets`
`Complexité g = 7 x 5 = 35`

___

### Tentative de vérification 2 - (réussite)

Nous avons introduis du code dans nos Main pour calculer le temps d'exécution de nos méthodes.

Voici comment nous avons procédé :

```java
        // Déclaration des variables de durées
        double duree;
        double duree_ms;
        long date_debut = System . nanoTime () ; //début du chronomètre

        //Calcul des chemins les plus courts
        // - Création d'un objet Djisktra ou BelmanFord
        // - Utilsation de la méthode résoudre sur l'objet Djisktra ou BelmanFord

        //Arrêt du chronomètre et calcul du temps en ns et en ms + affichage
        long date_fin = System . nanoTime () ;
        duree = (date_fin - date_debut) ;
        duree_ms = duree / 1000000;
        System.out.println("La duree de calcul du point fixe avec la méthode de Djikstra est de : " + duree + "ns" + " ou " + duree_ms + "ms");
```

Suite à l'exécution de nos Mains, nous en avons conclus que la méthode de Dijsktra était plus efficace.

Les temps d'exécution n'étaient pas les même à chaque fois (on étudie des temps en nanosecondes qui sont très variables dû aux différents programmes qui tournent sur l'ordinateur), les résultats étaient très variables.

Pour palier à cela, nous avons modifier notre code pour faire en sorte d'exécuter nos méthodes 100 fois de suite puis de faire une moyenne du temps total pour obtenir des résultats cohérents.

```java
        // Déclaration des variables de durées
        double duree;
        double duree_ms;
        long date_debut = System . nanoTime () ; //début du chronomètre
        Valeur resultat = null;


        //Calcul des chemins les plus courts
        for (int i = 0; i < 100 ; i++){
            // - Création d'un objet Djisktra ou BelmanFord
            // - Utilsation de la méthode résoudre sur l'objet Djisktra ou BelmanFord
        }

        //Arrêt du chronomètre et calcul du temps en ns et en ms + affichage
        long date_fin = System . nanoTime () ;
        duree = (date_fin - date_debut) / 100 ; //Division par 100 pour calculer la moyenne
        duree_ms = duree / 1000000;
        System.out.println("La duree de calcul du point fixe avec la méthode de Djikstra est de : " + duree + "ns" + " ou " + duree_ms + "ms");
```


