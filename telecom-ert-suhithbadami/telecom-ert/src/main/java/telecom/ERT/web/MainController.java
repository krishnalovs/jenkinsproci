package telecom.ERT.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        try {

            return "index";
        } catch (Exception ex) {
            
            ex.printStackTrace();

            return "error"; 
        }
    }

    @GetMapping("/login")
    public String login() {
        try {
            return "login";
        } catch (Exception ex) {
            
            ex.printStackTrace();

            return "error";
        }
    }
}
