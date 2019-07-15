package pruebas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pruebas.service.GreetingService06;


@Controller
public class GreetingController06 {
	
	private final GreetingService06 service;

    public GreetingController06(GreetingService06 service) {
        this.service = service;
    }

    @RequestMapping("/greeting")
    public @ResponseBody String greeting() {
        return service.greet();
    }

}
