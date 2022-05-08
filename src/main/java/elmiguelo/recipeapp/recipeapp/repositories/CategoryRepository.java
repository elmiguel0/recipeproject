package elmiguelo.recipeapp.recipeapp.repositories;

import elmiguelo.recipeapp.recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
