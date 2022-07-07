package elmiguelo.recipeapp.recipeapp.controller;

import elmiguelo.recipeapp.recipeapp.domain.Recipe;
import elmiguelo.recipeapp.recipeapp.service.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class RecipeControllerTest {

    RecipeController recipeController;
    @Mock
    RecipeService recipeService;
    @Mock
    Model model;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        recipeController = new RecipeController(recipeService);
    }

    @Test
    public void testMockMVC() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(recipeController).build();

        mockMvc.perform(get("/recipe"))
                .andExpect(status().isOk())
                .andExpect(view().name("recipe/recipe"));
    }

    @Test
    void testGetRecipe() throws Exception {
        //given
        Recipe recipe = new Recipe();
        recipe.setId(1L);

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(recipeController).build();
        when(recipeService.findById(anyLong())).thenReturn(recipe);

        mockMvc.perform(get("/recipe/show/1"))
                .andExpect(status().isOk())
                .andExpect(view().name("recipe/show"))
                .andExpect(model().attributeExists("recipe"));
    }
    /* this is not use anymore
      @Test
          void showRecipes() {
              //given
              Set<Recipe> recipes = new HashSet<>();
              recipes.add(new Recipe());
              recipes.add(new Recipe());

              when(recipeService.getRecipes()).thenReturn(recipes);

              ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);

              //when
              String viewName = recipeController.showRecipes(model);

              //then
              assertEquals("recipe/recipe",viewName);
              verify(recipeService,times(1)).getRecipes();
              verify(model,times(1)).addAttribute(eq("recipes"),argumentCaptor.capture());
              Set<Recipe> setController = argumentCaptor.getValue();
              assertEquals(2,setController.size());
          }
     */
}