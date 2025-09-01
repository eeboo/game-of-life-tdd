package com.company.gameoflife;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.assertj.core.api.Assertions.*;

class GameOfLifeTest {
    
    @Test
    void should_kill_cell_with_no_neighbors() {
        // TODO: Test de la règle 1 (sous-population)
        // Règle: Cellule vivante avec < 2 voisins vivants → meurt
        // Given
        Grid initialGrid = new Grid(3, 3);
        // Position center = new Position(1, 1);
        // initialGrid.setCellAlive(center);
        // GameOfLife game = new GameOfLife(initialGrid);
        // When
        // Then
    }
    
    @Test
    void should_kill_cell_with_more_than_three_neighbors() {
        // TODO: Test de la règle 2 (surpopulation)
        // Règle: Cellule vivante avec > 3 voisins vivants → meurt
        // Given
        // When
        // Then
    }
    
    @Test
    void should_keep_cell_alive_with_two_neighbors() {
        // TODO: Test de la règle 3a (survie avec 2 voisins)
        // Règle: Cellule vivante avec 2 voisins vivants → survit
        // Given
        // When
        // Then
    }
    
    @Test
    void should_keep_cell_alive_with_three_neighbors() {
        // TODO: Test de la règle 3b (survie avec 3 voisins)  
        // Règle: Cellule vivante avec 3 voisins vivants → survit
        // Given
        // When
        // Then
    }
    
    @Test
    void should_bring_dead_cell_to_life_with_three_neighbors() {
        // TODO: Test de la règle 4 (naissance)
        // Règle: Cellule morte avec exactement 3 voisins vivants → devient vivante
        // Given
        // When
        // Then
    }
    
    @Test
    void should_not_bring_dead_cell_to_life_with_two_neighbors() {
        // TODO: Test que cellule morte avec 2 voisins reste morte
        // Given
        // When
        // Then
    }
    
    @Test
    void should_simulate_blinker_pattern() {
        // TODO: Test avec un pattern classique (Blinker)
        // Pattern Blinker: 3 cellules horizontales deviennent 3 cellules verticales et vice-versa
        // Given
        // When
        // Then
    }
}