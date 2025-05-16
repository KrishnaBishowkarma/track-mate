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
}
