package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ChienTD2 on 09/09/2019.
 */
@Controller
public class HomeController {
    @RequestMapping("/dddd")
    public String home(){
        return "add";
    }

}
