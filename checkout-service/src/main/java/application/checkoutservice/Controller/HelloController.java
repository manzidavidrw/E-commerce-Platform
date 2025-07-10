package application.checkoutservice.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/api/checkout/hello")
    @ResponseBody
    public String HelloController() {
        return"hello there";
    }
}
