package np.com.krishnabk.trackmate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    // Expose "/hello" endpoint to check if the application is working or not!
    @GetMapping("/hello")
    public String sayHello(){
        return "Hey there, How are you?";
    }

    // Expose "/hi" endpoint to check if spring-boot-devtools woking or not
    @GetMapping("/hi")
    public String sayHi(){
        return "Hi there, How are you?";
    }

    // Expose "/lucky" endpoint to reverify the spring-boot-devtools function
    @GetMapping("/lucky")
    public String sayLucky(){
        return "Today is your lucky day!";
    }
}
