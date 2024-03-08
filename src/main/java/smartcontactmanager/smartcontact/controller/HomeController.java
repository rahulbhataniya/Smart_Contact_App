package smartcontactmanager.smartcontact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
  @RequestMapping("/home")
  public String home(Model model)
  {
    model.addAttribute("message", "Hello from Spring Boot! Home page");
    return "Home";
  }
  @RequestMapping("/about")
    public String about(Model model)
    {
      model.addAttribute("message", "Hello from Spring Boot! about section");
       return "about";
    }
}
