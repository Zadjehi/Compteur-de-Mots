# Compteur de Mots

## Description
Ce programme Java compte automatiquement le nombre de mots dans un fichier texte. Il lit le fichier ligne par ligne, sépare chaque ligne en mots et additionne le total.

## Fonctionnalités
- Lecture de fichiers texte avec File Scanner
- Comptage ligne par ligne des mots
- Séparation des mots en utilisant l'espace comme délimiteur
- Affichage détaillé du comptage par ligne
- Gestion des erreurs si le fichier n'existe pas

## Structure du projet
- `CompteurMots.java` : Programme principal de comptage
- `texte_test.txt` : Fichier de test
- `README.md` : Documentation du projet

## Prérequis
- Java 21 ou plus récent
- Terminal ou invite de commande

## Installation et utilisation

### 1. Télécharger le projet
```bash
git clone https://github.com/Zadjehi/Compteur-de-Mots.git
cd Compteur-de-Mots
```

### 2. Compiler le programme
```bash
javac CompteurMots.java
```

### 3. Exécuter avec le fichier de test
```bash
java CompteurMots
```


## Comment ça marche

1. **Lecture du fichier** : Utilise `Scanner` et `File` pour ouvrir le fichier
2. **Lecture ligne par ligne** : Boucle `while` avec `hasNextLine()`
3. **Séparation des mots** : Méthode `split(" ")` pour séparer avec l'espace
4. **Comptage** : Compte la longueur du tableau de mots
5. **Addition** : Additionne tous les mots de toutes les lignes
6. **Affichage** : Montre le résultat final

## Gestion des erreurs
- Vérification de l'existence du fichier
- Messages d'erreur clairs
- Validation des mots non vides

## Fonctionnalités avancées
- Ignore les espaces multiples
- Compte uniquement les mots non vides
- Affichage détaillé ligne par ligne
- Comptage du nombre total de lignes

## Auteur
Zadjehi Moahe Emmanuel Hyacinthe Junior - Exercice de programmation Java

