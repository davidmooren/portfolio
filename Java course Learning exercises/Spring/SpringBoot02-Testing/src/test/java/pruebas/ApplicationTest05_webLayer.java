package pruebas;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import pruebas.controller.HomeController;


/*
 * The test assertion is the same as in the previous case, 
but here Spring Boot is only instantiating the web layer, 
not the whole context. In an application with multiple 
controllers you can even ask for just one to be instantiated,
 using, for example @WebMvcTest(HomeController.class)
 */

/*
 * https://stackoverflow.com/questions/39865596/difference-between-using-mockmvc-with-springboottest-and-using-webmvctest
 * @SpringBootTest is the general test annotation. 
 * If you're looking for something that does the same 
 * thing prior to 1.4, that's the one you should use. 
 * It does not use slicing at all which means it'll 
 * start your full application context and not customize 
 * component scanning at all.

@WebMvcTest is only going to scan the controller you've 
defined and the MVC infrastructure. That's it. So if your controller has some dependency to other beans from your service layer, the test won't start until you either load that config yourself or provide a mock for it. This is much faster as we only load a tiny portion of your app. This annotation uses slicing.
 */


//In an application with multiple controllers you can even ask for just one to be instantiated, using, for example  @WebMvcTest(HomeController.class)
@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
public class ApplicationTest05_webLayer {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc
        .perform(get("/"))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().string(containsString("Hello World")));
    }
}