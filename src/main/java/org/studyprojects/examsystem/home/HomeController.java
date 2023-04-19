package org.studyprojects.examsystem.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public RedirectView homeredirect(){
        return new RedirectView("/home",true);
    }

    @RequestMapping("/home")
    @ResponseBody
    public String home(){
        return "home controller reporting";
    }
}
