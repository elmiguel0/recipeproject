package elmiguelo.recipeapp.recipeapp.controller;

import elmiguelo.recipeapp.recipeapp.domain.Category;
import elmiguelo.recipeapp.recipeapp.domain.UnitOfMeasure;
import elmiguelo.recipeapp.recipeapp.repositories.CategoryRepository;
import elmiguelo.recipeapp.recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        return "index";
    }
}
