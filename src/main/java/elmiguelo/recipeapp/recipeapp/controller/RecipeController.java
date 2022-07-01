package elmiguelo.recipeapp.recipeapp.controller;

import elmiguelo.recipeapp.recipeapp.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Slf4j
@Controller
@RequestMapping("/recipe")
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public String showRecipes(Model model){
        log.debug("retrieve recipes");
        model.addAttribute("recipes",recipeService.getRecipes());
        return "recipe/recipe";
    }

    @GetMapping("show/{id}")
    public String showById(@PathVariable String id, Model model){
        log.debug("retrieve recipe by id");
        model.addAttribute("recipe",recipeService.findById(Long.valueOf(id)));
        return "recipe/show";
    }
}
