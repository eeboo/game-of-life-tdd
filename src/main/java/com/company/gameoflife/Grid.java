package com.company.gameoflife;

import java.util.Set;

public class Grid {
    
    // TODO: Implémenter la grille de cellules
    // Suggestion: utiliser une Map<Position, Cell> ou Set<Position> pour les cellules vivantes
    
    public Grid(int width, int height) {
        // TODO: Implémenter le constructeur
    }
    
    public void setCellAlive(Position position) {
        // TODO: Implémenter
    }
    
    public void setCellDead(Position position) {
        // TODO: Implémenter
    }
    
    public boolean isCellAlive(Position position) {
        // TODO: Implémenter
        return false;
    }
    
    public int countLivingNeighbors(Position position) {
        // TODO: Implémenter le comptage des voisins vivants
        // Les 8 positions voisines sont : (-1,-1), (-1,0), (-1,1), (0,-1), (0,1), (1,-1), (1,0), (1,1)
        return 0;
    }
    
    public Set<Position> getLivingCells() {
        // TODO: Retourner toutes les cellules vivantes
        return Set.of();
    }
    
    public int getWidth() {
        // TODO: Implémenter
        return 0;
    }
    
    public int getHeight() {
        // TODO: Implémenter  
        return 0;
    }
}