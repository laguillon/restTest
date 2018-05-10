package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @Autowired
    Foo foo;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping(value = "/multiply", method = RequestMethod.GET, produces = "application/json")
    public Multiplier Multiply(@RequestParam(value="a") int a, @RequestParam(value="b") int b)
    {
    	return new Multiplier(a, b);
    }
    
    @RequestMapping("/foo")
    public String foo()
    {
    	return foo.Print();
    }
}
