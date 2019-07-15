package pruebas;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import pruebas.controller.GreetingController06;
import pruebas.service.GreetingService06;

@RunWith(SpringRunner.class)
@WebMvcTest(GreetingController06.class)
public class ApplicationTest06_WebMock {

    @Autowired
    private MockMvc mockMvc;

    /*
     * We use @MockBean to create and inject a mock for 
     * the GreetingService (if you don’t do this the 
     * application context cannot start), and we set 
     * its expectations using Mockito.
     */
    @MockBean
    private GreetingService06 service;

    @Test
    public void greetingShouldReturnMessageFromService() throws Exception {
        //Con esta linea estoy trucando la capa de servicios para
    	//devolver un valor concreto. Si la comento, devuelve Hola Mundo
    	//Fijate que en la linea 31 no es autowired sino que es un mock
    	//si anulo la linea siguiente realmnte no inyecta una capa de servicios
    	//when(service.greet()).thenReturn("Hello Mock");
    	
        this.mockMvc
        .perform(get("/greeting"))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().string(containsString("Hello World6")));
    }
}
