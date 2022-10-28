# Examen Blanc Design Pattern et Programmation Orientée Aspect
## 1- Le Diagramme de classe du modèle
+ Donner la possibilité de Créer un groupe de figures. Chaque groupe peut contenir d’autres groupes. On va utiliser le design pattern Composite car on voudrait Organiser des objets en structure arborescente afin de représenter une hiérarchie.

![image](https://user-images.githubusercontent.com/52087288/198540508-c1fb089e-1413-4c3e-a600-c2a8ed05e5df.png)

+ Nous introduisons un Objet Paramétrage dont l’état est défini par attributs par défaut comme l’épaisseur du contour, la couleur du contour et la couleur de remplissage. On voudrait qu’à chaque fois que l’état de cet objet change, toutes les figures doivent être notifiées pour se mettre à jour. On va utiliser le design pattern Observer car on voudrait que tous les objets soient informés lorsqu’un objet change d’état lorsqu’un objet change d’état.

![image](https://user-images.githubusercontent.com/52087288/198542793-d86a979b-20df-49bb-94d8-7f21ec7e17bc.png)

+ Une méthode « traiter » qui permet de traiter le contenu du dessin en utilisant une famille d’algorithmes qui sont interchangeables dynamiquement. Ce signifie qu’au moment de l’exécution, l’objet dessin pour changer d’algorithme avec un autre de la même famille. Chaque algorithme peut évoluer indépendamment de la classe dessin qui les utilise. On va utiliser le design pattern Strategy .

![image](https://user-images.githubusercontent.com/52087288/198544500-ee66e3ab-d7cc-4b2a-8c4f-2936eca73b92.png)

## 2- L'implémentation du modèle en utilisant un projet Maven
+ La sturcture du projet dans IntelliJ IDEA. Et on a divisé le projet en quatre package "Strategy","Observable","Composite" et "entities"

![image](https://user-images.githubusercontent.com/52087288/198551473-dfac9907-b273-4e81-ab37-ddd1500fe31f.png)

## 3- Les Tests du modèle
