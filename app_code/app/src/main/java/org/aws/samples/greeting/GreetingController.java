package org.aws.samples.greeting;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author MaheshR
 */
@RestController
public class GreetingController {

//    @RequestMapping("/hello")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello from AWS ProServe version2";
    }
//    public String sayHello(HttpServletRequest request) {
//        return "Hello from AWS ProServe version2";
//    }
   
}
