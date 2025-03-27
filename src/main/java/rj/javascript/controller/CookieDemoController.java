package rj.javascript.controller;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class CookieDemoController {

    // ✅ Sets initial cookies and serves the HTML page
    @GetMapping("/mycookies")
    public String index(HttpServletResponse response, Model model) {
        // Set server-side cookies
        Cookie userCookie = new Cookie("username", "JohnDoe");
        Cookie themeCookie = new Cookie("theme", "light");
        
        userCookie.setMaxAge(60 * 60 * 24); // 1 day expiry
        themeCookie.setMaxAge(60 * 60 * 24);
        
        response.addCookie(userCookie);
        response.addCookie(themeCookie);

        return "servercookies";  // Renders cookie-demo.html
    }
}
