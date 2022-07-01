package elmiguelo.recipeapp.recipeapp.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category category;
    @BeforeEach
    void setUp() {
        category = new Category();
    }

    @Test
    void getId() {
        Long idValue = 4L;
        category.setId(idValue);
        assertEquals(idValue,category.getId());
    }

    @Test
    void getDescription() {
        String description = "this is a typical recipe";
        category.setDescription(description);
        assertEquals(description,category.getDescription().toString());
    }

    @Test
    void getRecipes() {
    }
}