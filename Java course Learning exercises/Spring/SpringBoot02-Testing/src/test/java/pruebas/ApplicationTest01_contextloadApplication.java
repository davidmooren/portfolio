package pruebas;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

/*
 * The @SpringBootTest annotation tells Spring Boot to go and look 
 * for a main configuration class (one with @SpringBootApplication 
 * for instance), and use that to start a Spring application context
 * 
 */

/*
 * @RunWith(SpringRunner.class) tells JUnit to run using Spring’s 
 * testing support. SpringRunner is the new name for 
 * SpringJUnit4ClassRunner. Por ejemplo, en vez de esa clase, podriamos
 * pasar un objeto Mockito
 * 
 */
 
/*
 * http://www.baeldung.com/junit-5-runwith
 * In JUnit 5, the @RunWith annotation has been replaced by the more powerful @ExtendWith annotation
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest01_contextloadApplication {

    @Test
    public void contextLoads() throws Exception {
    	//Deberia fallar aposta
    	assertThat(false).isTrue();
    }

}