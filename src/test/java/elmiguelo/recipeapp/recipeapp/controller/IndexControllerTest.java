package elmiguelo.recipeapp.recipeapp.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class IndexControllerTest {

    IndexController indexController;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        indexController = new IndexController();
    }

    @Test
    void getIndexPage() throws Exception {
        String viewName = indexController.getIndexPage();
        assertEquals("index",viewName);
    }
}