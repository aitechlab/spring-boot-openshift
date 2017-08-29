package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloWildFlyController {
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloWildFlyController.class);


    @RequestMapping("hello")
    public String sayHello(){
		Logger.info("sayHello is called");
        return ("Hello, Magnus SpringBoot app on Wildfly, v1");
    }
}
