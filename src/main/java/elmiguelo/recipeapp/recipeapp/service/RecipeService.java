package elmiguelo.recipeapp.recipeapp.service;

import elmiguelo.recipeapp.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
}
