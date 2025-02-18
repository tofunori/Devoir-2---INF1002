# INF1002 - Devoir 2 - Automne 2021

## Session d’hiver 2025

**Barème :** 5 points  
**Date limite de remise :** Dimanche 02 mars 2025 (portail de cours).  
**Équipe :** 4 à 5 étudiant(e)s.  

---

Le club de soccer de votre ville désire avoir un programme lui permettant de créer les équipes qui composent son club. Chaque équipe est caractérisée par :
- Son **nom**
- La **catégorie** à laquelle elle appartient (*senior, junior, amateur*)
- La **liste des joueurs** qui la composent
- Le **nombre de victoires** de chaque équipe

Chaque joueur d’une équipe est caractérisé par :
- Son **prénom**
- Son **nom**
- Son **âge**

## Objectif 1 : Création d’une classe `Joueur`

Créer une classe `Joueur` avec :

### 1.1 Variables d’instances :
- `nom`
- `prénom`
- `âge`

### 1.2 Un constructeur :
Permettant de créer une instance d’un objet `Joueur` avec le même nombre de paramètres que le nombre de variables d’instances.

### 1.3 Méthodes :
- Une méthode `toString` comprenant toutes les variables définissant un `Joueur`.

## Objectif 2 : Création d’une énumération de catégories

Les catégories de l’énumération `Categories` doivent être les suivantes :
- `Senior`
- `Junior`
- `Amateur`

---

## Objectif 3 : Création d’une classe `Equipe`

Créer une classe `Equipe` avec :

### 3.1 Variables d’instances :
- `nom`
- `nombre de parties gagnées`
- `liste de joueurs` (objets de type `Joueur`)
- `catégorie` (du type de l’énumération `Categories`)

### 3.2 Un constructeur :
Permettant de créer une instance d’un objet `Equipe` avec seulement **deux** paramètres : le nom de l’équipe et la catégorie.

### 3.3 Méthodes :
- **Accesseurs** de toutes les variables d’instances.
- **Mutateurs** pour toutes les variables d’instances.
- `ajoutPartiesGagnees` : permet d’incrémenter d’une certaine quantité le nombre de parties gagnées.
- `nombreJoueurs` : retourne le nombre de joueurs dans la liste.
- `ajouterJoueur` : permet d’ajouter un joueur à la liste de joueurs (à la fin de la liste).
- `supprimerJoueur` : permet de supprimer un joueur de la liste de joueurs à partir de son **indice**.

---

## Objectif 4 : Création et manipulation d’instances d’objets de type `Joueur` et `Equipe`

Créer une classe `GestionnaireEquipes` comprenant une méthode **pilote (`main`)** permettant d’effectuer les actions suivantes :

1. Création de **8 objets** de type `Joueur`
2. Création de **2 objets** de type `Equipe`
3. Ajout des **4 premiers joueurs** à la **première équipe**
4. Ajout des **4 autres joueurs** à la **seconde équipe**
5. Fixer le nombre de parties gagnées de la **première équipe** à **4**
6. Fixer le nombre de parties gagnées de la **deuxième équipe** à **5**
7. Ajouter **2 parties gagnées** à la **première équipe** à l’aide de la méthode `ajoutPartiesGagnees`
8. Comparer le **nombre de parties gagnées** des deux équipes et afficher à la console **l’équipe ayant le plus grand nombre de parties gagnées**
9. Obtenir le **nombre de joueurs** de chaque équipe et afficher ces nombres à la console
10. **Supprimer le joueur à l’indice 3** de l’**équipe 1**
11. **Afficher tous les joueurs** de l’**équipe 1** à la console
12. **Afficher tous les joueurs** de l’**équipe 2** à la console

---

📌 **Remarque :** Le travail est à remettre sous forme de projet (pour faciliter la correction). 

**N’oubliez pas les bonnes règles de programmation et de documenter (raisonnablement) votre code. La qualité du code sera prise en compte dans l’évaluation.**

---

**INF1002 - Introduction à la programmation objet**  
**Devoir n° 2**
