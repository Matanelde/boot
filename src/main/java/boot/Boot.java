package boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration
@SpringBootApplication
@ImportResource({"classpath*:services.xml"}) 	
public class Boot {
	 @RequestMapping("/")
	    @ResponseBody
	    String home() {
	        return "Hello World!";
	    }

	    public static void main(String[] args) throws Exception {
	        SpringApplication.run(Boot.class, args);
	    }
}