package elmiguelo.recipeapp.recipeapp.controller;

import elmiguelo.recipeapp.recipeapp.domain.Category;
import elmiguelo.recipeapp.recipeapp.domain.UnitOfMeasure;
import elmiguelo.recipeapp.recipeapp.repositories.CategoryRepository;
import elmiguelo.recipeapp.recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class indexController {
    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public indexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        Optional<Category> category = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");
        System.out.println(category.get().getId());
        System.out.println(unitOfMeasure.get().getId());
        return "index";
    }
}
