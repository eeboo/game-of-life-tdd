# Game of Life - Coding Dojo TDD

## 🎯 Objectif
Implémenter le Jeu de la Vie de Conway en utilisant le Test-Driven Development (TDD).

## 📋 Règles du jeu
1. Toute cellule vivante avec moins de 2 voisins vivants meurt (sous-population)
2. Toute cellule vivante avec plus de 3 voisins vivants meurt (surpopulation)  
3. Toute cellule vivante avec 2 ou 3 voisins vivants survit
4. Toute cellule morte avec exactement 3 voisins vivants devient vivante

## 🔄 Cycle TDD
1. **RED** : Écrire un test qui échoue
2. **GREEN** : Écrire le minimum de code pour faire passer le test
3. **REFACTOR** : Améliorer le code sans changer le comportement

## 🚀 Commandes
```bash
# Compiler le projet
mvn compile

# Lancer les tests
mvn test

# Lancer les tests en mode continu
mvn test -Dtest=**/*Test

# Clean et test
mvn clean test
```

## 📚 Étapes suggérées
1. Modéliser une cellule (vivante/morte)
2. Créer une position (coordonnées)
3. Créer une grille de cellules
4. Compter les voisins d'une cellule
5. Appliquer les règles de transition
6. Calculer la génération suivante

## 🎨 Conseils TDD
- Commencez par le test le plus simple
- Écrivez le minimum de code pour faire passer le test
- Refactorisez seulement quand tous les tests passent
- Un test = un seul concept
- Nommez vos tests de manière expressive

## 📖 Patterns classiques du Game of Life
- **Still lifes** : Block, Bee-hive, Loaf, Boat
- **Oscillators** : Blinker, Toad, Beacon
- **Spaceships** : Glider, Light-weight spaceship