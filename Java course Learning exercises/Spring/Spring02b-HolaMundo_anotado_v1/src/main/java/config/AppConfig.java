package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //solo indica que en esta clase estará la configuracion
@ComponentScan("service") //este @ dice que si quiere algo lo busque en la carpeta service, luego en springboot no es necesaria esta linea
public class AppConfig {

}
