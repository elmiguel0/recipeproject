package elmiguelo.recipeapp.recipeapp.repositories;

import elmiguelo.recipeapp.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
