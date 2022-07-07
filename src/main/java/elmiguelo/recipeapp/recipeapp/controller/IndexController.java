package elmiguelo.recipeapp.recipeapp.controller;

import elmiguelo.recipeapp.recipeapp.domain.Category;
import elmiguelo.recipeapp.recipeapp.domain.UnitOfMeasure;
import elmiguelo.recipeapp.recipeapp.repositories.CategoryRepository;
import elmiguelo.recipeapp.recipeapp.repositories.UnitOfMeasureRepository;
import elmiguelo.recipeapp.recipeapp.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    @Autowired
    RecipeService service;
    @GetMapping
    public String getIndex(Model model){
        log.debug("retrieve Index Page");
        model.addAttribute("recipes",service.getRecipes());
        return "index";
    }
}
