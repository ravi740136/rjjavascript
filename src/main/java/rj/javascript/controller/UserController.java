package rj.javascript.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

    @PostMapping("/adduser")
    public String handleFormSubmission(@RequestParam("name") String name, 
                                       @RequestParam("email") String email, 
                                       Model model) {
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        return "success";  // Redirects to success.html
    }
    

    // ✅ Display form-submission.html when user visits /form-submission
    @GetMapping("/createuser")
    public String showForm() {
        return "form-submission"; // ✅ Returns form-submission.html from templates folder
    }
}
