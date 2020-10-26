# TP4 : Travail fait par Ahmed Rahmouni & Diallo Talibe 
Transforming a UML to a Java Program. 

- Le programe rassemble a une simualtion des vols et reservation .
- On a pas pu gerer les vols reguliers vu quand a pas compris le concept.
- Dans le main , On a des Listes normales & Nested Lists :
  - ArrayList : Pour regrouper les ZonedDateTime ; A fin de faciliter la lecture du code
  - ArrayList : des compagnie (Ordre non important)
      - ArrayList : les vols de chqaue compagnie (ordre non important dans notre cas d'utilisation)
          - LinkedHashSet : Pour les escales de chaque vols (Order Improtant , et element unique)   
  - ArrayList : des Clients
    - ArrayList : des Reservations de chaque clients
 - On a utiliser deux Interfaces , Etape et Personne :
    - Etape : Une interface utiliser dans Escale et Vol , declare quelques methodes (je voulait ajouter la methode calc_duree dans l'interface , mais on l'as mis avec signature prives , et on a pas voulu changer toute la classe )
    - Personne : une interface pour les classe Client et Passager (vue que les deux sont des personnes) : <strong>Mais a la fin , on ne l'a pas utliser😅</strong>
  - Pour les status des Vols , On avait plusieurs idees dont on a choisie le suivant :
    - Tout les vols sont ouvert lors de leurs creation (On a utliser une boucle pour ouvrir tout les vols dans le main , mais on pouvait l'unitialiser dans la class)
    - Les vols sont fermees automatiquement quand la duree entre la duree d'execution et le depart du vol est moins de 6h (simmilarie la fermeture des enregistrement)
  - Pour les Reservations :
    - Tout les reservations sont confirmees apres 24h apres leur creations sauf sous l'intervention du proprietaire (Similaire aux reservations modifiable sous 24h , apres non rembourssable)
