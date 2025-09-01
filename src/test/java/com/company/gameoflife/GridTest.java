package com.company.gameoflife;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.assertj.core.api.Assertions.*;

class GridTest {
    
    private Grid grid;
    
    @BeforeEach
    void setUp() {
        grid = new Grid(3, 3);
    }
    
    @Test
    void should_create_empty_grid() {
        // TODO: Test de création d'une grille vide
        // Given
        // When
        // Then
    }
    
    @Test
    void should_set_cell_alive() {
        // TODO: Test pour rendre une cellule vivante
        // Given
        Position position = new Position(1, 1);
        // When
        // Then
    }
    
    @Test
    void should_set_cell_dead() {
        // TODO: Test pour tuer une cellule
        // Given
        // When
        // Then
    }
    
    @Test
    void should_count_zero_neighbors_for_isolated_cell() {
        // TODO: Test de comptage de voisins pour cellule isolée
        // Given
        Position position = new Position(1, 1);
        // When
        // Then
    }
    
    @Test
    void should_count_one_neighbor() {
        // TODO: Test avec un voisin
        // Given
        Position center = new Position(1, 1);
        Position neighbor = new Position(0, 0);
        // When
        // Then
    }
    
    @Test
    void should_count_all_eight_neighbors() {
        // TODO: Test avec tous les voisins (cas maximum)
        // Given
        Position center = new Position(1, 1);
        // When
        // Then
    }
    
    @Test
    void should_return_living_cells() {
        // TODO: Test pour récupérer toutes les cellules vivantes
        // Given
        // When
        // Then
    }
}