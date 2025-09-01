package com.company.gameoflife;

public class GameOfLife {
    
    // TODO: Implémenter la logique principale du jeu
    
    public GameOfLife(Grid initialGrid) {
        // TODO: Implémenter le constructeur
    }
    
    public Grid nextGeneration() {
        // TODO: Calculer la génération suivante selon les règles :
        // 1. Cellule vivante avec < 2 voisins vivants → meurt (sous-population)
        // 2. Cellule vivante avec > 3 voisins vivants → meurt (surpopulation) 
        // 3. Cellule vivante avec 2 ou 3 voisins vivants → survit
        // 4. Cellule morte avec exactement 3 voisins vivants → devient vivante
        return null;
    }
    
    public Grid getCurrentGrid() {
        // TODO: Retourner la grille actuelle
        return null;
    }
}