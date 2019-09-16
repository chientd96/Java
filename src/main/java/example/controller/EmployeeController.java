package example.controller;

import example.beans.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ChienTD2 on 10/09/2019.
 */
@Controller
public class EmployeeController {
    @RequestMapping(value = "/addEmployee",method = RequestMethod.GET)
    public String addEmployee(Model model){
        model.addAttribute("employee", new Employee());
        return "add";
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String showList(@ModelAttribute("employee") Employee emp, ModelMap modelMap){
        modelMap.addAttribute("employee", emp);
        return "home";
    }
}
