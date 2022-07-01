package elmiguelo.recipeapp.recipeapp.service;

import elmiguelo.recipeapp.recipeapp.domain.Recipe;
import elmiguelo.recipeapp.recipeapp.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RecipeServiceImplTest {

    RecipeService recipeService;
    @Mock
    RecipeRepository recipeRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);

    }

    @Test
    void getRecipe() {
        Recipe recipe = new Recipe();
        HashSet recipeData = new HashSet();

        recipeData.add(recipe);
        when(recipeService.getRecipes()).thenReturn(recipeData);

        Set<Recipe> recipes = recipeService.getRecipes();

        assertEquals(recipes.size(),1);

        verify(recipeRepository,times(1)).findAll();
    }
}