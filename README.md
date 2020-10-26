# TP4 : Travail fait par Ahmed Rahmouni & Diallo Talibe 
Transforming a UML to a Java Program. 

- Le programe rassemble a une simualtion des vols et reservation .
- On a pas pu gerer les vols reguliers vu quand a pas compris le concept.
- Dans le main , On a des Listes normales & Nested Lists :
  - ArrayList : Pour groupes les ZonedDateTime ; Pour faciliter la lecture du code
  - ArrayList : des compagnie (Ordre non important)
      - ArrayList : des vols de chque compagnie (ordre non important dans notre cas d'utilisation)
          - LinkedHashSet : Pour les escales de chaque vols (Order Improtant , et element unique)
-   
  - ArrayList : des Cleints
    - ArrayList : des Reservations de chaque clients
 - On a utiliser deux Interfaces , Etape et Personne :
  - Etape : Une interface utiliser dans Escale et Vol , declare quelques methodes (je voulait ajouter la methode calc_duree dans l'interface , mais on l'as mis avec signature prives , et on voulait pas changer toute la classe )
  - Personne : une interface pour les classe Client et Passager (vue que les deux sont des personnes) : <strong>Mais a la fin , on ne l'a pas utliser😅</strong>
  
