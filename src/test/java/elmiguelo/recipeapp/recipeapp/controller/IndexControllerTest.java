package elmiguelo.recipeapp.recipeapp.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;


class IndexControllerTest {

    IndexController indexController;
    @Mock
    Model model;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        indexController = new IndexController();
    }

    @Test
    void getIndexPage() throws Exception {
        String viewName = indexController.getIndex(model);
        assertEquals("index",viewName);
    }
}